package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages= {"api"})
@EnableJpaRepositories("dao")
@EntityScan("dto")
public class ContactsWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactsWsApplication.class, args);
	}
}
