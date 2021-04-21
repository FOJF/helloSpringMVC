package kr.ac.hansung.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class RegisterController {

	@Autowired

	SubjectService ss;

	@RequestMapping("/register")
	public String register(Model model) {
		model.addAttribute("subject", new Subject());
		return "register";
	}

	@RequestMapping("/registered")
	public String registered(Model model, @Valid Subject subject, BindingResult result, HttpServletResponse response) {

		if(result.hasErrors()) {
			
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
				
			}
			return "register";
		}
		
		ss.insert(subject);

		return "successRegister";
	}
}
