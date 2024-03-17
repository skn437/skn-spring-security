package best.skn.security.properties;

//? Java::Library
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * External OAuth2 Configuration Property Class
 * <div>
 *  <p>There is a property called 'skn.security.oauth2.client.success' for externalizing configurations</p>
 *  <p>The sub-properties are:</p>
 *  <p>(1) Success Redirection URL: it's a String under 'skn.security.oauth2.client.success.redirect'. It holds the successful login redirection page address. When a user is successfully logged in, he/she will be redirected to this address.</p>
 * </div>
 *
 * @author SKN
 * @version 1.1.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.oauth2.client.success")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OAuth2Property {

  /**
   * A String containing the URL for the successful OAuth2.0 login redirection page in OAuth2 configuration
   *
   * @since v1.0.0
   */
  private String redirect;
}
