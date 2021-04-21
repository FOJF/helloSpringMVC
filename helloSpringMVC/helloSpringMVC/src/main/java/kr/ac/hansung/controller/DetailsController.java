package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Subject;
import kr.ac.hansung.service.SubjectService;

@Controller
public class DetailsController {
	@Autowired
	SubjectService ss;
	@RequestMapping("/details/{year}-{term}")
	public String details(Model model, @PathVariable("year") int year, @PathVariable("term") int term) {
		List<Subject> subjects = ss.getCurrent();
		
		for(int i = 0; i < subjects.size(); i++) {
			if(subjects.get(i).getYear() != year || subjects.get(i).getTerm() != term) {
				subjects.remove(i);
				i--;
			}
		}
		
		model.addAttribute("subjects", subjects);
		
		return "details";
	}

}
