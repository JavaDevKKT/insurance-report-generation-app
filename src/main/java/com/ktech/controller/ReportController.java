package com.ktech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReportController {

	@GetMapping("/")
	public String welcomePage() {
		return "index";
	}
}
