package best.skn.security.services.impls;

//? Java::Source
import best.skn.security.services.CsrfService;
//? Java::Library
import best.skn.utils.message.Message;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * CSRF Service Implementation Class
 *
 * @author SKN Shukhan
 * @version 1.2.1
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
public class CsrfServiceImpl implements CsrfService {

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
