package lv.com.virtual;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EntityScan(basePackages = "lv.com.virtual.model")
@ComponentScan(basePackages = {"lv.*"})
@EnableJpaRepositories(basePackages = {"lv.com.virtual.repository"})
@EnableTransactionManagement
public class LvJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LvJavaApplication.class, args);
		
		/* codificador de senha*/
		//System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
