package com.pradeep.SpringBootReactApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex() {
		return "index.html";
	}
}
