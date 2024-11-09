package best.skn.security.properties;

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
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.authorize")
public class SecurityProperty {

  /**
   * An array of String containing the endpoints ignored by OAuth2 login in Security configuration
   *
   * @since v1.0.0
   */
  private String[] exchanges;

  /**
   * Public Constructor with all private properties
   *
   * @param exchanges String Array
   *
   * @since v1.4.0
   */
  public SecurityProperty(String[] exchanges) {
    this.exchanges = exchanges;
  }

  /**
   * Public Constructor with no argument
   *
   * @since v1.4.0
   */
  public SecurityProperty() {}

  /**
   * Getter method for `exchanges` field
   *
   * @return String Array for `exchanges` field
   *
   * @since v1.4.0
   */
  public String[] getExchanges() {
    return this.exchanges;
  }

  /**
   * Setter method for `exchanges` field
   *
   * @param value String Array for `exchanges` field
   *
   * @since v1.4.0
   */
  public void setExchanges(String[] value) {
    this.exchanges = value;
  }
}
