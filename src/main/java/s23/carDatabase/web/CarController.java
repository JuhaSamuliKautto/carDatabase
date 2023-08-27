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
	
	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "This is the contact page";
	
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String hei(@RequestParam(name = "location") String paikka, @RequestParam(name="name") String nimi) {
		return "Welcome to the " + paikka + " " + nimi + "!";
	
	}
}
