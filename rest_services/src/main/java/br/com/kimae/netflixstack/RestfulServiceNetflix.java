package br.com.kimae.netflixstack;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestfulServiceNetflix {
	public static void main(String[] args) {
		new SpringApplicationBuilder(RestfulServiceNetflix.class).web(true).run(args);
	}

}
