package best.skn.security.services.impls;

//? Java::Source
import best.skn.security.services.PrincipalService;
//? Java::Library
import best.skn.utils.message.Message;
import java.security.Principal;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Principal Service Implementation Class
 *
 * @author SKN Shukhan
 * @version 1.2.1
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Service
public class PrincipalServiceImpl implements PrincipalService {

  @Override
  public Mono<Principal> principalRouteGetRequest(Principal principal)
    throws Exception {
    try {
      Mono<Principal> principalInfo = Mono.just(principal).log();
      return principalInfo;
    } catch (Exception e) {
      throw new Exception(Message.errorServer(e.getMessage()));
    }
  }
}
