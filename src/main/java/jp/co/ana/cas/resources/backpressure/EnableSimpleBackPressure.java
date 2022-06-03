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

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * <p>
 * <b> この実装は Back Pressure 実装の一例です。 レジリエンスに関する要件や通信方式により必要となる実装は異なります。
 * 本実装を利用する場合はサービスの要件に合致しているか検討の上、利用してください。 </b>
 * </p>
 * <p>
 * {@link SimpleBackPressureAspect} の処理を実装するメソッドに指定するアノテーション。
 * </p>
 * 
 * @see SimpleBackPressureAspect
 */
@Target(ElementType.METHOD)
public @interface EnableSimpleBackPressure {

}
