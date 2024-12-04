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
 * @version 1.5.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Configuration
public class SessionConfiguration {

  /**
   * Configuration bean for session service
   *
   * @return SessionService object for auto-configuration
   * @throws BeanCreationException an exception is thrown if an error occurs while creating bean
   * @throws BeanInstantiationException an exception is thrown if an error occurs while instantiating bean
   * @throws NullPointerException an exception is thrown if null pointer is found
   *
   * @since v1.4.0
   */
  @Bean
  SessionService sessionService() throws BeanCreationException, BeanInstantiationException, NullPointerException {
    try {
      SessionService sessionService = new SessionServiceImpl();

      System.out.printf("%s", Message.successConsole("Session Configuration Initiated Successfully!"));

      return sessionService;
    } catch (BeanCreationException e) {
      System.out.printf(
        "Session Configuration Error: Bean Creation Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (BeanInstantiationException e) {
      System.out.printf(
        "Session Configuration Error: Bean Instantiation Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (NullPointerException e) {
      System.out.printf(
        "Session Configuration Error: Null Pointer Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (Exception e) {
      System.out.printf("Session Configuration Error: Exception: %s", Message.errorConsole(e.getMessage()));
      return null;
    }
  }
}
