package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class MainController{
//	@Autowired
//	UserDataRepository repository;
//	
//	@RequestMapping(value="")

	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mv) {
		mv.setViewName("index");
		return mv;
	}
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(ModelAndView mv) {
		mv.setViewName("/login");
		return mv;
	}
	@RequestMapping(value="/recipe",method=RequestMethod.GET)
	public ModelAndView recipe(ModelAndView mv) {
		mv.setViewName("/recipe");
		return mv;
	}
	
	
}
