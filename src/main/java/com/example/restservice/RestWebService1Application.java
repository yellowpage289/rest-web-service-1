package com.example.restservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestWebService1Application implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(RestWebService1Application.class);

	public static void main(String[] args) {
		SpringApplication.run(RestWebService1Application.class);
	}

	public void run(String... args) throws Exception {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"https://openlibrary.org/works/OL45883W.json",
				String.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			log.info("==== RESTful API Response using Spring RESTTemplate START =======");
			log.info(response.toString());
			log.info("==== RESTful API Response using Spring RESTTemplate END =======");
		} else {
			log.info("API Response: " + response.getStatusCode().toString());
		}
	}

}
