package ltd.zndo.pom.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PomDemoController {

	@RequestMapping("/")
	public String demo() {
		return "Better World!";
	}
}
