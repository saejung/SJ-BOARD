package com.sjBoard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping(value="/main")
	public String mainPage() throws Exception
	{
		return "main";
	} 
}
