package best.skn.security.properties;

import java.util.Arrays;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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
 * @version 1.3.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@Component
@ConfigurationProperties("skn.security.cors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorsSourceProperty {

  /**
   * An array of String containing the allowed origins in CORS configuration
   *
   * @since v1.0.0
   */
  private String[] origins;

  /**
   *  a getter method to get a list of CORS allowed origins
   *
   * @return a list of String containing the allowed origins in CORS configuration
   * @since v1.0.0
   */
  public List<String> getOriginList() {
    List<String> originList = Arrays.asList(this.origins);
    return originList;
  }
}
