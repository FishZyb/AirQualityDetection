import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author 一只鱼zzz
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan("com.neu")
@MapperScan("com.neu.*.mapper")
public class AQIRunApplication {
  public static void main(String[] args) {
    SpringApplication.run(AQIRunApplication.class);
  }
}
