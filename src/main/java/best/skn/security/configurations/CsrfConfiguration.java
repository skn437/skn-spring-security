package best.skn.security.configurations;

import best.skn.security.services.CsrfService;
import best.skn.security.services.impls.CsrfServiceImpl;
import best.skn.utils.message.Message;
import java.util.Optional;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CSRF configuration class for auto-configuring CSRF service
 *
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Configuration
public class CsrfConfiguration {

  /**
   * Configuration bean for csrf service
   *
   * @return an Optional of CsrfService object for auto-configuration
   * @throws BeanCreationException an exception is thrown if an error occurs while creating bean
   * @throws BeanInstantiationException an exception is thrown if an error occurs while instantiating bean
   * @throws NullPointerException an exception is thrown if null pointer is found
   *
   * @since v1.4.0
   */
  @Bean
  Optional<CsrfService> csrfService() throws BeanCreationException, BeanInstantiationException, NullPointerException {
    try {
      CsrfService csrfService = new CsrfServiceImpl();

      System.out.print(Message.successConsole("CSRF Configuration Initiated Successfully!"));

      return Optional.of(csrfService);
    } catch (BeanCreationException e) {
      System.out.printf(Message.errorConsole(e.getMessage()));
      return Optional.empty();
    } catch (BeanInstantiationException e) {
      System.out.printf(Message.errorConsole(e.getMessage()));
      return Optional.empty();
    } catch (NullPointerException e) {
      System.out.printf(Message.errorConsole(e.getMessage()));
      return Optional.empty();
    }
  }
}
