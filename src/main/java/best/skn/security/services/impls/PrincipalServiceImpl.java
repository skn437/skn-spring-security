package best.skn.security.services.impls;

import best.skn.security.services.PrincipalService;
import best.skn.utils.message.Message;
import java.security.Principal;
import java.util.Optional;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Principal Service Implementation Class
 *
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
public class PrincipalServiceImpl implements PrincipalService {

  @Override
  public Optional<Mono<Principal>> principalRouteGetRequest(Principal principal) throws Exception {
    try {
      Mono<Principal> principalInfo = Mono.just(principal).log();
      return Optional.of(principalInfo);
    } catch (Exception e) {
      System.out.println(Message.errorServer(e.getMessage()));
      return Optional.empty();
    }
  }
}
