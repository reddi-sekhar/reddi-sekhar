package jp.co.ana.cas.resources.common.config;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import lombok.extern.log4j.Log4j2;

@Configuration
@Log4j2
public class Resilience4jConfig {

    @Autowired
    private CircuitBreakerRegistry circuitBreakerRegistry;

    @PostConstruct
    public void debugCircuitBreakerEvent() {
        this.circuitBreakerRegistry.getAllCircuitBreakers().forEach(circuitBreaker -> {
          circuitBreaker.getEventPublisher() //
            .onSuccess(e -> log.debug("CircuitBreaker: 処理成功")) //
            .onIgnoredError(e -> log.debug("CircuitBreaker: 処理成功(設定済みのエラーを無視)")) //
            .onError(e -> log.debug("CircuitBreaker: 処理失敗"))
            .onStateTransition(e -> log.debug("CircuitBreaker: 状態遷移 {} -> {}", e.getStateTransition().getFromState(), e.getStateTransition().getToState())) //
            .onReset(e -> log.debug("CircuitBreaker: 状態リセット")) //
            .onCallNotPermitted(e -> log.debug("CircuitBreaker: アクセス遮断"));
        });
    }
}
