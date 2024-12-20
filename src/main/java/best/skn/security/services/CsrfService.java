package best.skn.security.services;

import java.util.Optional;
import org.springframework.security.web.server.csrf.CsrfToken;
import reactor.core.publisher.Mono;

/**
 * CSRF Service Interface
 *
 * @author SKN Shukhan
 * @version 1.5.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
public interface CsrfService {
  /**
   * Method to get the CSRF token as response of GET request
   *
   * @param token a CsrfToken as parameter
   * @return an Optional of Mono of CsrfToken as a response
   * @throws Exception an exception is thrown if CsrfToken GET request fails
   * @since v1.0.0
   */
  public Optional<Mono<CsrfToken>> csrfRouteGetRequest(CsrfToken token) throws Exception;
}
