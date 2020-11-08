package com.example.demo.trySpring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
// point1 
@Controller
public class HelloController {
	//point2 
	@GetMapping("/hello")
	public String getHello() {
		// send to hello html
		return "hello";
	}
}
