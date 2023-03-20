package com.gdsc.ruturtle.turtle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TurtleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurtleApplication.class, args);
	}

}
