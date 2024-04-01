package best.skn.security.services.principal;

//? Java::Library
import best.skn.utils.message.Message;
import java.security.Principal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * Principal Service Class
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
public class PrincipalService implements PrincipalInterface {

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
