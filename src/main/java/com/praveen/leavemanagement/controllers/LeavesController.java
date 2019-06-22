package com.praveen.leavemanagement.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.praveen.leavemanagement.domains.Leave;
import com.praveen.leavemanagement.services.LeaveService;

@Controller
@RequestMapping("/leaves")
public class LeavesController {
	@Autowired
	private LeaveService service;
	
	@GetMapping()
	public String getAllLeaves(Model model) {
		List<Leave> leaves = service.findAll();
		model.addAttribute("leaves", leaves);
		return "leaves/index";
	}

}
