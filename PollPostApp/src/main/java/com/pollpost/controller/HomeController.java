package com.pollpost.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pollpost.constraints.StringConstraints;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String getCategory(Model model){
		
		return StringConstraints.HOME_PAGE;
	}
}