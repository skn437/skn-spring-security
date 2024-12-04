package best.skn.security.configurations;

import best.skn.security.services.CsrfService;
import best.skn.security.services.impls.CsrfServiceImpl;
import best.skn.utils.message.Message;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CSRF configuration class for auto-configuring CSRF service
 *
 * @author SKN Shukhan
 * @version 1.5.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Configuration
public class CsrfConfiguration {

  /**
   * Configuration bean for csrf service
   *
   * @return CsrfService object for auto-configuration
   * @throws BeanCreationException an exception is thrown if an error occurs while creating bean
   * @throws BeanInstantiationException an exception is thrown if an error occurs while instantiating bean
   * @throws NullPointerException an exception is thrown if null pointer is found
   *
   * @since v1.4.0
   */
  @Bean
  CsrfService csrfService() throws BeanCreationException, BeanInstantiationException, NullPointerException {
    try {
      CsrfService csrfService = new CsrfServiceImpl();

      System.out.printf("%s", Message.successConsole("CSRF Configuration Initiated Successfully!"));

      return csrfService;
    } catch (BeanCreationException e) {
      System.out.printf("CSRF Configuration Error: Bean Creation Exception: %s", Message.errorConsole(e.getMessage()));
      return null;
    } catch (BeanInstantiationException e) {
      System.out.printf(
        "CSRF Configuration Error: Bean Instantiation Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (NullPointerException e) {
      System.out.printf("CSRF Configuration Error: Null Pointer Exception: %s", Message.errorConsole(e.getMessage()));
      return null;
    } catch (Exception e) {
      System.out.printf("CSRF Configuration Error: Exception: %s", Message.errorConsole(e.getMessage()));
      return null;
    }
  }
}
