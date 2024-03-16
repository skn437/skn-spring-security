package best.skn.security.services.session;

//? Java::Library
import org.springframework.stereotype.Component;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

/**
 * Session Service Interface
 *
 * @author SKN
 * @version 1.0.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Component
public interface SessionInterface {
  /**
   * Method to get WebSession as response of GET request
   *
   * @param webSession a WebSession as parameter
   * @return a Mono of WebSession as a response
   * @throws Exception an exception if WebSession GET request fails
   * @since v1.0.0
   */
  public Mono<WebSession> sessionRouteGetRequest(WebSession webSession)
    throws Exception;
}
