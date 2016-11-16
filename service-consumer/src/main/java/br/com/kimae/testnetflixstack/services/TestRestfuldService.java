package br.com.kimae.testnetflixstack.services;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "test-services")
public interface TestRestfuldService {
	@RequestMapping(value = "/test/service/hello")
	public String hello();
}
