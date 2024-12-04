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
 * @version 1.5.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Configuration
public class PrincipalConfiguration {

  /**
   * Configuration bean for principal service
   *
   * @return PrincipalService object for auto-configuration
   * @throws BeanCreationException an exception is thrown if an error occurs while creating bean
   * @throws BeanInstantiationException an exception is thrown if an error occurs while instantiating bean
   * @throws NullPointerException an exception is thrown if null pointer is found
   *
   * @since v1.4.0
   */
  @Bean
  PrincipalService principalService() throws BeanCreationException, BeanInstantiationException, NullPointerException {
    try {
      PrincipalService principalService = new PrincipalServiceImpl();

      System.out.printf("%s", Message.successConsole("Principal Configuration Initiated Successfully!"));

      return principalService;
    } catch (BeanCreationException e) {
      System.out.printf(
        "Principal Configuration Error: Bean Creation Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (BeanInstantiationException e) {
      System.out.printf(
        "Principal Configuration Error: Bean Instantiation Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (NullPointerException e) {
      System.out.printf(
        "Principal Configuration Error: Null Pointer Exception: %s",
        Message.errorConsole(e.getMessage())
      );
      return null;
    } catch (Exception e) {
      System.out.printf("Principal Configuration Error: Exception: %s", Message.errorConsole(e.getMessage()));
      return null;
    }
  }
}
