package best.skn.security.configurations;

import best.skn.security.services.SessionService;
import best.skn.security.services.impls.SessionServiceImpl;
import best.skn.utils.message.Message;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Session configuration class for auto-configuring session service
 *
 * @author SKN Shukhan
 * @version 1.3.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
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
    SessionService sessionService = new SessionServiceImpl();

    System.out.printf(Message.successConsole("Session Configuration Initiated Successfully!"));

    return sessionService;
  }
}
