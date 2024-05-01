package best.skn.security.services;

//? Java::Library
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

/**
 * Session Service Interface
 *
 * @author SKN Shukhan
 * @version 1.2.1
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
public interface SessionService {
  /**
   * Method to get WebSession as response of GET request
   *
   * @param webSession a WebSession as parameter
   * @return a Mono of WebSession as a response
   * @throws Exception an exception is thrown if WebSession GET request fails
   * @since v1.0.0
   */
  public Mono<WebSession> sessionRouteGetRequest(WebSession webSession)
    throws Exception;
}
