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
 * @version 1.3.1
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
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
  CsrfService csrfService() throws BeanCreationException, BeanInstantiationException, NullPointerException, Exception {
    try {
      CsrfService csrfService = new CsrfServiceImpl();

      System.out.print(Message.successConsole("CSRF Configuration Initiated Successfully!"));

      return csrfService;
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
