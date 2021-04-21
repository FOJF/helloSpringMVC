package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class LoginController {
		 @RequestMapping(value="/login")
		  public String login(@RequestParam(value="error", required=false) String error,Model model) {
			 if(error !=null) {
				 model.addAttribute("errormsg","로그인 실패");
			 }
		  	return "login";
		}


}
