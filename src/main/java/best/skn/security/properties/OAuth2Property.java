package best.skn.security.properties;

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
 * @author SKN Shukhan
 * @version 1.5.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.oauth2.client.success")
public class OAuth2Property {

  /**
   * A String containing the URL for the successful OAuth2.0 login redirection page in OAuth2 configuration
   *
   * @since v1.0.0
   */
  private String redirect;

  /**
   * Public Constructor with all private properties
   *
   * @param redirect String
   *
   * @since v1.4.0
   */
  public OAuth2Property(String redirect) {
    this.redirect = redirect;
  }

  /**
   * Public Constructor with no argument
   *
   * @since v1.4.0
   */
  public OAuth2Property() {}

  /**
   * Getter method for `redirect` field
   *
   * @return String for `redirect` field
   *
   * @since v1.4.0
   */
  public String getRedirect() {
    return this.redirect;
  }

  /**
   * Setter method for `redirect` field
   *
   * @param value String for `redirect` field
   *
   * @since v1.4.0
   */
  public void setRedirect(String value) {
    this.redirect = value;
  }
}
