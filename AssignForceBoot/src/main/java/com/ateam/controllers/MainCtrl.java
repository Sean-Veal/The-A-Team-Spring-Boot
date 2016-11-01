package com.ateam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainCtrl {

	@RequestMapping("/")
	public String home(){
		return "home.html";
	}
}
