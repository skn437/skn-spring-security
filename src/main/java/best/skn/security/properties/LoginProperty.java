package best.skn.security.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * External Login Configuration Property Class
 * <div>
 *  <p>There is a property called 'skn.security.login' for externalizing configurations</p>
 *  <p>The sub-properties are:</p>
 *  <p>(1) Login URL: it's a String under 'skn.security.login.url'. It holds the address for the login page url where users will be prompted to login.</p>
 * </div>
 *
 * @author SKN Shukhan
 * @version 1.3.1
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.login")
public class LoginProperty {

  /**
   * A String containing the URL for the login page in Login configuration
   *
   * @since v1.0.0
   */
  private String url;

  public LoginProperty(String url) {
    this.url = url;
  }

  public LoginProperty() {}

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String value) {
    this.url = value;
  }
}
