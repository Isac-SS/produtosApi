package com.github.isacss.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProdutosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

	@GetMapping("/hello-world")
	public String helloWord() {
		return "Hello Word!";
	}
}


