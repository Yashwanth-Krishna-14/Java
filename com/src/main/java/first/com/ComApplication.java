package first.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComApplication {

	public static void main(String[] args) {


		  ApplicationContext context =  SpringApplication.run(ComApplication.class, args);


		Devil obj =context.getBean(Devil.class);

		obj.build();

	}

}
