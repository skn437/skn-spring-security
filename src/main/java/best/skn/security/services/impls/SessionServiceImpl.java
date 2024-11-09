package best.skn.security.services.impls;

import best.skn.security.services.SessionService;
import best.skn.utils.message.Message;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

/**
 * Session Service Implementation Class
 *
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
public class SessionServiceImpl implements SessionService {

  @Override
  public Optional<Mono<WebSession>> sessionRouteGetRequest(WebSession webSession) throws Exception {
    try {
      Mono<WebSession> webSessionInfo = Mono.just(webSession).log();
      return Optional.of(webSessionInfo);
    } catch (Exception e) {
      System.out.println(Message.errorServer(e.getMessage()));
      return Optional.empty();
    }
  }
}
