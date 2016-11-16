package br.com.kimae.netflixstack.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestfuldService {

	@RequestMapping("/test/service/hello")
	public String hello(){
		return "hello ;D";
	}
}
