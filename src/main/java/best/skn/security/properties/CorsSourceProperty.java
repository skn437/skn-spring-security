package best.skn.security.properties;

import java.util.Arrays;
import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * External CORS Configuration Property Class
 * <div>
 *  <p>There is a property called 'skn.security.cors' for externalizing configurations</p>
 *  <p>The sub-properties are:</p>
 *  <p>(1) Origins: it's an array of String under 'skn.security.cors.origins'. It holds all the addresses for the allowed origins.</p>
 * </div>
 *
 * @author SKN Shukhan
 * @version 1.4.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.cors")
public class CorsSourceProperty {

  /**
   * An array of String containing the allowed origins in CORS configuration
   *
   * @since v1.0.0
   */
  private String[] origins;

  /**
   * Public Constructor with all private properties
   *
   * @param origins String Array
   *
   * @since v1.4.0
   */
  public CorsSourceProperty(String[] origins) {
    this.origins = origins;
  }

  /**
   * Public Constructor with no argument
   *
   * @since v1.4.0
   */
  public CorsSourceProperty() {}

  /**
   * Getter method for `origins` field
   *
   * @return String Array for `origins` field
   *
   * @since v1.4.0
   */
  public String[] getOrigins() {
    return this.origins;
  }

  /**
   * Setter method for `origins` field
   *
   * @param value String Array for `origins` field
   *
   * @since v1.4.0
   */
  public void setOrigins(String[] value) {
    this.origins = value;
  }

  /**
   * Getter method to get a list of CORS allowed origins
   *
   * @return a list of String containing the allowed origins in CORS configuration
   *
   * @since v1.0.0
   */
  public List<String> getOriginList() {
    List<String> originList = Arrays.asList(this.origins);
    return originList;
  }
}
