package best.skn.security.services.impls;

import best.skn.security.services.CsrfService;
import best.skn.utils.message.Message;
import java.util.Optional;
import org.springframework.security.web.server.csrf.CsrfToken;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * CSRF Service Implementation Class
 *
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
public class CsrfServiceImpl implements CsrfService {

  @Override
  public Optional<Mono<CsrfToken>> csrfRouteGetRequest(CsrfToken token) throws Exception {
    try {
      Mono<CsrfToken> csrfToken = Mono.just(token).log();
      return Optional.of(csrfToken);
    } catch (Exception e) {
      System.out.println(Message.errorServer(e.getMessage()));
      return Optional.empty();
    }
  }
}
