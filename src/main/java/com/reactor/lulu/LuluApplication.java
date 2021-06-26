package com.reactor.lulu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LuluApplication {

	public static void main(String[] args) {
		log.info("Starting LuluApplication...");
		SpringApplication.run(LuluApplication.class, args);
	}

}
