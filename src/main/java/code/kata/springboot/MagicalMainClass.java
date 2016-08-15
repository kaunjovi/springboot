package code.kata.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MagicalMainClass {
	private final static Logger logger = LoggerFactory
			.getLogger("code.kata.springboot.MagicalMainClass");

	public static void main(String[] args) {
		logger.debug("Hello world.");

		// This is the magic sauce that will bootstrap the spring application.
		SpringApplication.run(MagicalMainClass.class, args);
	}
}
