package tn.enig.restService;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {
	
	
	@GetMapping("/")
	public String getHomePage() {
		return "home.jsp";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}
	@GetMapping("/logout_success")
	public String logout() {
		return "logout_success.jsp";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}

}
