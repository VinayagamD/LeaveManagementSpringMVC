package com.praveen.leavemanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@GetMapping("")
	public ModelAndView getIndex() {
		return new ModelAndView("index/index");
	}

}
