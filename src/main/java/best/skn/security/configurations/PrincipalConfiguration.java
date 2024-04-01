package best.skn.security.configurations;

//? Java::Source
import best.skn.security.services.principal.PrincipalService;
//? Java::Library
import best.skn.utils.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Principal configuration class for auto-configuring principal service
 *
 * @author SKN
 * @version 1.1.1
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Configuration
public class PrincipalConfiguration {

  /**
   * Configuration bean for principal service
   *
   * @return a PrincipalService object for auto-configuration
   * @since v1.0.0
   */
  @Bean
  PrincipalService principalService() {
    PrincipalService principalService = new PrincipalService();

    System.out.printf(
      Message.successConsole("Principal Configuration Initiated Successfully!")
    );

    return principalService;
  }
}
