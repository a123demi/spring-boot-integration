package com.lm.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.lm.second.config.props.MultipleMongoProperties;


/**
 * Hello world!
 *
 */
@EnableConfigurationProperties(MultipleMongoProperties.class)
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

