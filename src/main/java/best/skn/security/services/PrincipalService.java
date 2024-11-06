package best.skn.security.services;

import java.security.Principal;
import reactor.core.publisher.Mono;

/**
 * Principal Service Interface
 *
 * @author SKN Shukhan
 * @version 1.3.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
public interface PrincipalService {
  /**
   * Method to get Principal as response of GET request
   *
   * @param principal a Principal as parameter
   * @return a Mono of Principal as a response
   * @throws Exception an exception is thrown if Principal GET request fails
   * @since v1.0.0
   */
  public Mono<Principal> principalRouteGetRequest(Principal principal) throws Exception;
}
