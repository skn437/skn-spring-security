package best.skn.security.services.impls;

//? Java::Source
import best.skn.security.services.SessionService;
//? Java::Library
import best.skn.utils.message.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

/**
 * Session Service Implementation Class
 *
 * @author SKN Shukhan
 * @version 1.2.0
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
public class SessionServiceImpl implements SessionService {

  @Override
  public Mono<WebSession> sessionRouteGetRequest(WebSession webSession)
    throws Exception {
    try {
      Mono<WebSession> webSessionInfo = Mono.just(webSession).log();
      return webSessionInfo;
    } catch (Exception e) {
      throw new Exception(Message.errorServer(e.getMessage()));
    }
  }
}
