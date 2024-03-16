package best.skn.security.configurations;

//? Java::Source
import best.skn.security.services.session.SessionService;
//? Java::Library
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Session configuration class for auto-configuring session service
 *
 * @author SKN
 * @version 1.0.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Configuration
public class SessionConfiguration {

  /**
   * Configuration bean for session service
   *
   * @return a SessionService object for auto-configuration
   * @since v1.0.0
   */
  @Bean
  SessionService sessionService() {
    SessionService sessionService = new SessionService();
    return sessionService;
  }
}
