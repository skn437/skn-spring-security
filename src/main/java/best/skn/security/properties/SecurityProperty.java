package best.skn.security.properties;

//? Java::Library
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * External Security Configuration Property Class
 * <div>
 *  <p>There is a property called 'skn.security.authorize' for externalizing configurations</p>
 *  <p>The sub-properties are:</p>
 *  <p>(1) Exchanges: it's an array of String under 'skn.security.authorize.exchanges'. It holds all the endpoints of the Spring Boot Application where oauth2 login won't be applicable.</p>
 * </div>
 *
 * @author SKN
 * @version 1.0.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.authorize")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SecurityProperty {

  /**
   * An array of String containing the endpoints ignored by OAuth2 login in Security configuration
   *
   * @since v1.0.0
   */
  private String[] exchanges;
}
