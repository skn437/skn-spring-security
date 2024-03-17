package best.skn.security;

//? Java::Library
import best.skn.utils.message.Message;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Class
 *
 * @author SKN
 * @version 1.1.0
 * @since 2024-03-16
 * @use.case Spring Boot Reactive
 * @dedicated.to Trina, Logno, Atoshi and My Parents
 */
@SpringBootApplication
public class MainApplication {

  /**
   * Static Method `main`
   *
   * @param args default parameter for the `main` static method
   * @since v1.0.0
   */
  public static void main(String[] args) {
    System.out.printf(
      Message.successConsole(
        "Spring Boot Reactive Security Service Initiated Successfully!"
      )
    );
  }
}
