package br.com.kimae.testnetflixstack.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.kimae.testnetflixstack.services.TestRestfuldService;

@Controller
@RequestMapping("/consume")
public class ConsumerTestController {
	
	@Autowired
	private TestRestfuldService testService;

	@RequestMapping("/hello-method")
	@ResponseBody
	public String consumeHello(){
		return "Consuming service test: " + testService.hello();
	}
}
