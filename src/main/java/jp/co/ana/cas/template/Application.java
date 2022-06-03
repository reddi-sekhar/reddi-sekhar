package jp.co.ana.cas.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring.
 * Bootã‚¢ãƒ—ãƒªã‚±ãƒ¼ã‚·ãƒ§ãƒ³ã�®ã‚¨ãƒ³ãƒˆãƒªãƒ�ã‚¤ãƒ³ãƒˆã�¨ã�ªã‚‹ã‚¯ãƒ©ã‚¹ã€‚
 * 
 */
@EnableFeignClients(basePackages = {"jp.co.ana.cas.b18.connector.*.client",
    "jp.co.ana.cas.resources.common.utils"})
@SpringBootApplication(scanBasePackages = {"jp.co.ana.cas.*"})
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Application {

	/**
	 * mainãƒ¡ã‚½ãƒƒãƒ‰ã€‚ Spring
	 * Bootã‚¢ãƒ—ãƒªã‚±ãƒ¼ã‚·ãƒ§ãƒ³ã�®èµ·å‹•å‡¦ç�†ã‚’å®Ÿè¡Œã�—ã�¾ã�™ã€‚
	 * 
	 * @param args ã‚³ãƒžãƒ³ãƒ‰ãƒ©ã‚¤ãƒ³å¼•æ•°ã€‚
	 */
  @SuppressWarnings("squid:S2095")
  public static void main(String[] args) {

    SpringApplication.run(Application.class, args);
  }

}
