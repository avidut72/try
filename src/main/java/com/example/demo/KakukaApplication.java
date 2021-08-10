package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.KafkaListener;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableKafka
@EnableSwagger2
@KafkaListener

public class KakukaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakukaApplication.class, args);
	}

}
