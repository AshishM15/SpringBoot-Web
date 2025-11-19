package in.ashish;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WellcomeRestControllar {
	
	@GetMapping("/")
	public String getMsg() {
		return "Welcome to TulasiBhog";
	}

}
