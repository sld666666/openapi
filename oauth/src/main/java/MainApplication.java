import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan("com.sld")
public class MainApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(MainApplication.class, args);
    }
}
