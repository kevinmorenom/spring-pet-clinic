package kevin.springframework.springpetclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({})
public class SpringPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPetClinicApplication.class, args);
	}

}
