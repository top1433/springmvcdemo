package net.xinqushi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="index")
	public ModelAndView hello() {
		
		ModelAndView mav=new ModelAndView();
		String viewName = "index";
		mav.setViewName(viewName);
		
		return mav;
	}
	
	@RequestMapping(value="test/cc")
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="a")
	public String test1() {
		return "welcome";
	}
}
