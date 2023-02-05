package k23.CarDatabase.Week1And2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {

	@RequestMapping("indeeeex")
	@ResponseBody
	public String returnIndexPage() {
		return "This is the main page";
	}

	@RequestMapping("contact")
	@ResponseBody
	public String returnContactPage() {
		return "This is the contact page";
	}

	@RequestMapping("hellouu")
	@ResponseBody
	public String sayHelloToSomeone(
			@RequestParam(name = "name", required = false, defaultValue = "person with no name") String name,
			@RequestParam(name = "location", required = false, defaultValue = "no location") String location) {
		return "Welcome to the " + location + " " + name + "!";
	}

}
