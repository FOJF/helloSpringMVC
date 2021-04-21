package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class InquiryController {

	@Autowired

	SubjectService ss;

	@RequestMapping("/inquiry")
	public String inquiryNow(Model model) {

		List<Subject> subjects = ss.getCurrent();

		model.addAttribute("subjects", subjects);
		
		return "inquiry";
	}
}