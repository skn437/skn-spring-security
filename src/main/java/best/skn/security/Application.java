package best.skn.security;

//? Java::Library
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application Class
 *
 * @author SKN Shukhan
 * @version 1.2.1
 * @since 2024-04-30
 * @use.case Spring Boot Reactive
 * @dedicated.to Logno, Atoshi and My Parents
 */
@SpringBootApplication
public class Application {

  /**
   * Static Method `main`
   *
   * @param args default parameter for the `main` static method
   * @since v1.2.0
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}
