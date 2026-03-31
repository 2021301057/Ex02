package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Ex02Application {
	@GetMapping("/")
	public String hello() {
		System.out.println("Ex02");
		return "Ex02 Project: 16:22";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ex02Application.class, args);
	}

}
