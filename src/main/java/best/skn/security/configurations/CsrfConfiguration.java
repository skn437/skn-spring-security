package best.skn.security.configurations;

//? Java::Source
import best.skn.security.services.csrf.CsrfService;
//? Java::Library
import best.skn.utils.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CSRF configuration class for auto-configuring CSRF service
 *
 * @author SKN
 * @version 1.1.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Configuration
public class CsrfConfiguration {

  /**
   * Configuration bean for CSRF service
   *
   * @return a CsrfService object for auto-configuration
   * @since v1.0.0
   */
  @Bean
  CsrfService csrfService() {
    CsrfService csrfService = new CsrfService();

    System.out.printf(
      Message.successConsole("CSRF Configuration Initiated Successfully!")
    );

    return csrfService;
  }
}
