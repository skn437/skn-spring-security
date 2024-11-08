package best.skn.security.configurations;

import best.skn.security.services.PrincipalService;
import best.skn.security.services.impls.PrincipalServiceImpl;
import best.skn.utils.message.Message;
import org.springframework.beans.BeanInstantiationException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Principal configuration class for auto-configuring principal service
 *
 * @author SKN Shukhan
 * @version 1.3.1
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
  PrincipalService principalService()
    throws BeanCreationException, BeanInstantiationException, NullPointerException, Exception {
    try {
      PrincipalService principalService = new PrincipalServiceImpl();

      System.out.print(Message.successConsole("Principal Configuration Initiated Successfully!"));

      return principalService;
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
