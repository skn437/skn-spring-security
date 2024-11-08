package best.skn.security.configurations;

import best.skn.security.services.SessionService;
import best.skn.security.services.impls.SessionServiceImpl;
import best.skn.utils.message.Message;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Session configuration class for auto-configuring session service
 *
 * @author SKN Shukhan
 * @version 1.3.1
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
  SessionService sessionService()
    throws BeanCreationException, BeanInstantiationException, NullPointerException, Exception {
    try {
      SessionService sessionService = new SessionServiceImpl();

      System.out.print(Message.successConsole("Session Configuration Initiated Successfully!"));

      return sessionService;
    } catch (BeanCreationException e) {
      throw new BeanCreationException(Message.errorConsole(e.getMessage()));
    } catch (BeanInstantiationException e) {
      throw new BeanInstantiationException(this.getClass(), Message.errorConsole(e.getMessage()));
    } catch (NullPointerException e) {
      throw new NullPointerException(Message.errorConsole(e.getMessage()));
    } catch (Exception e) {
      throw new Exception(Message.errorConsole(e.getMessage()));
    }
  }
}
