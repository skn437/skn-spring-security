package best.skn.security.services.csrf;

//? Java::Library
import best.skn.utils.message.Message;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * CSRF Service Class
 *
 * @author SKN
 * @version 1.1.1
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
@NoArgsConstructor
@Getter
@Setter
public class CsrfService implements CsrfInterface {

  @Override
  public Mono<CsrfToken> csrfRouteGetRequest(CsrfToken token) throws Exception {
    try {
      Mono<CsrfToken> csrfToken = Mono.just(token).log();
      return csrfToken;
    } catch (Exception e) {
      throw new Exception(Message.errorServer(e.getMessage()));
    }
  }
}
