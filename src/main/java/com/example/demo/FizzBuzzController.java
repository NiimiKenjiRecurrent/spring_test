package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/apply", method = RequestMethod.POST)
	public ModelAndView apply(ModelAndView mv,@RequestParam("num")int num) {
		String str="";
		if(num%3==0) {
			str+="Fizz ";
		}
		if(num%5==0) {
			str+="Buzz ";
		}
		if(num%7==0) {
			str+="Ass ";
		}
		if(str==""||num==0) {
			str="gg";
		}
		mv.addObject("result",str);
		mv.addObject("num",num);
		mv.setViewName("index");
		return mv;
	}
}
