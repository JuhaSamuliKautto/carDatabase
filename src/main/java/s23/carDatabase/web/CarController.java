package s23.carDatabase.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CarController {
	
	@RequestMapping("main")
	@ResponseBody
	public String showMainPage() {
		return "Tämä on pääsivu";
	}
	
	@RequestMapping("moikkaa")
	@ResponseBody
	public String sayHelloToSomebody(@RequestParam(name = "nimesi", required=false, defaultValue="Muumi") String nimi,
			@RequestParam(name="ika") int age) {
		return "Hei " + nimi + " " + age + " vuotta.";
	}
}
