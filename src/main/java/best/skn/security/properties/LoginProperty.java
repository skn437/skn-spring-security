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
 * @version 1.5.0
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

  /**
   * Public Constructor with all private properties
   *
   * @param url String
   *
   * @since v1.4.0
   */
  public LoginProperty(String url) {
    this.url = url;
  }

  /**
   * Public Constructor with no argument
   *
   * @since v1.4.0
   */
  public LoginProperty() {}

  /**
   * Getter method for `url` field
   *
   * @return String for `url` field
   *
   * @since v1.4.0
   */
  public String getUrl() {
    return this.url;
  }

  /**
   * Setter method for `url` field
   *
   * @param value String for `url` field
   *
   * @since v1.4.0
   */
  public void setUrl(String value) {
    this.url = value;
  }
}
