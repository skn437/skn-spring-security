package best.skn.security.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * External Security Configuration Property Class
 * <div>
 *  <p>There is a property called 'skn.security.authorize' for externalizing configurations</p>
 *  <p>The sub-properties are:</p>
 *  <p>(1) Exchanges: it's an array of String under 'skn.security.authorize.exchanges'. It holds all the endpoints of the Spring Boot Application where oauth2 login won't be applicable.</p>
 * </div>
 *
 * @author SKN Shukhan
 * @version 1.3.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@ConfigurationProperties("skn.security.authorize")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecurityProperty {

  /**
   * An array of String containing the endpoints ignored by OAuth2 login in Security configuration
   *
   * @since v1.0.0
   */
  private String[] exchanges;
}
