package com.github.eendroroy.twitterz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author indrajit
 */

@EnableAutoConfiguration
@SpringBootApplication
public class TwitterzApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterzApplication.class, args);
	}
}
