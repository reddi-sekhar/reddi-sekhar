//
// COPYRIGHT (C) NEC CORPORATION
//
// ALL RIGHTS RESERVED BY NEC NEC CORPORATION, THIS PROGRAM
// MUST BE USED SOLELY FOR THE PURPOSE FOR WHICH IT WAS
// FURNISHED BY NEC NEC CORPORATION, NO PART OF THIS PROGRAM
// MAY BE REPRODUCED OR DISCLOSED TO OTHERS, IN ANY FORM
// WITHOUT THE PRIOR WRITTEN PERMISSION OF NEC NEC CORPORATION.
//
// NEC CORPORATION CONFIDENTIAL AND PROPRIETARY
package jp.co.ana.cas.resources.backpressure;

import java.util.concurrent.atomic.AtomicInteger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import jp.co.ana.cas.resources.handler.ErrorDto;
import lombok.extern.log4j.Log4j2;

/**
 * <p>
 * <b> この実装は Back Pressure 実装の一例です。 レジリエンスに関する要件や通信方式により必要となる実装は異なります。
 * 本実装を利用する場合はサービスの要件に合致しているか検討の上、利用してください。 </b>
 * </p>
 * <p>
 * 同時実行リクエスト数が閾値に達した場合に次のリクエストを受け付けない (HTTP/503 Service Unavailable を返却する ) 単純な
 * Back Pressure を実行するための Advice を実装するクラス。
 * </p>
 * <p>
 * {@link EnableSimpleBackPressure} が設定され、かつ {@link ResponseEntity}
 * を返却するメソッドの実行直前に同時実行数の判定を行い、 指定した閾値に達している場合に HTTP/503 Service Unavailable
 * を返却します。
 * </p>
 * <p>
 * 同時実行数はこの Advice を設定する全てのメソッド全てを通じてカウントされます。 メソッド別には同時実行数をカウントしないので注意して下さい。
 * </p>
 * <p>
 * 判定に利用する閾値は <code>MSTMP_BP_THRESHOLD</code> に <code>Integer</code>
 * 精度の整数値で指定します。 閾値のデフォルトは <code>100</code> です。 閾値に 0
 * 以下の数値を指定した場合は同時実行数の判定は無効になります。
 * </p>
 * 
 * @see EnableSimpleBackPressure
 */
@Aspect
@Component
@Log4j2
public class SimpleBackPressureAspect {

    @Value("${MSTMP_BP_THRESHOLD:100}")
    protected Integer backPressureThreshold;

    private static AtomicInteger threadCount = new AtomicInteger(0);

    @Around("@annotation(EnableSimpleBackPressure) && execution(public org.springframework.http.ResponseEntity *(..))")
    public ResponseEntity<?> aroundControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
        if (backPressureThreshold > 0) {
            if (threadCount.get() >= backPressureThreshold) {
                String message = "API is busy. " + threadCount + " thread are working. Limit is "
                        + backPressureThreshold + ".";
                log.warn(message);

                ErrorDto retDto = new ErrorDto();
                retDto.addMessage(message);

                return new ResponseEntity<>(retDto, HttpStatus.SERVICE_UNAVAILABLE);
            }

            try {
                threadCount.getAndIncrement();

                ResponseEntity<?> response = (ResponseEntity<?>) pjp.proceed();

                return response;
            } finally {
                threadCount.getAndDecrement();
            }
        } else {
            return (ResponseEntity<?>) pjp.proceed();
        }
    }

}
