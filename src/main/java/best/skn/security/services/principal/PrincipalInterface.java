package best.skn.security.services.principal;

//? Java::Library
import java.security.Principal;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * Principal Service Interface
 *
 * @author SKN
 * @version 1.1.1
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Component
public interface PrincipalInterface {
  /**
   * Method to get Principal as response of GET request
   *
   * @param principal a Principal as parameter
   * @return a Mono of Principal as a response
   * @throws Exception an exception if Principal GET request fails
   * @since v1.0.0
   */
  public Mono<Principal> principalRouteGetRequest(Principal principal)
    throws Exception;
}
