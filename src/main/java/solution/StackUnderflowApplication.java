package solution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Map;

@SpringBootApplication
public class StackUnderflowApplication implements CommandLineRunner {

	@Autowired
	private EventbriteService eventbriteService;

	public static void main(String[] args) {
		SpringApplication.run(StackUnderflowApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Map<String, Object> userDetails = eventbriteService.fetchUserDetails();
		System.out.println(userDetails);
	}
}
