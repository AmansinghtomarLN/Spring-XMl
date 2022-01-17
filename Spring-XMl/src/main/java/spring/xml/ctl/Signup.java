package spring.xml.ctl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.xml.dto.SignupDto;


@Controller
public class Signup {
	
	@ResponseBody
	@RequestMapping("/display")
	public String display() {
		
		return "Hello Aman !! Response Body annotation is working fine ";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		
		return "signup";	
	}
	
	@RequestMapping("/register")
	public String signupData(SignupDto dto, Model model) {
		System.out.println("name is"+dto.getName());
		model.addAttribute("dto", dto);
		
		return "successful";	
	}
	

}
