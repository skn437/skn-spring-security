package best.skn.security.services.session;

//? Java::Library
import best.skn.utils.message.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.server.WebSession;
import reactor.core.publisher.Mono;

/**
 * Session Service Class
 *
 * @author SKN
 * @version 1.1.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Service
@NoArgsConstructor
@Getter
@Setter
public class SessionService implements SessionInterface {

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
