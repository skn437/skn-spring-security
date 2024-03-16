package best.skn.security.services.csrf;

//? Java::Library
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * CSRF Service Interface
 *
 * @author SKN
 * @version 1.0.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Component
public interface CsrfInterface {
  /**
   * Method to get the CSRF token as response of GET request
   *
   * @param token a CsrfToken as parameter
   * @return a Mono of CsrfToken as a response
   * @throws Exception an exception if CsrfToken GET request fails
   * @since v1.0.0
   */
  public Mono<CsrfToken> csrfRouteGetRequest(CsrfToken token) throws Exception;
}
