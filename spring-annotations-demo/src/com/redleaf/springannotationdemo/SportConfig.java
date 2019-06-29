package com.redleaf.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.redleaf.springannotationdemo")
@PropertySource("classpath:sports.properties")
public class SportConfig {
	
	//define sadFortune; methodname is the bean ID
	@Bean
	public FortuneService sadFortuneService () {
		return new SadFortuneService();
	}
	
	
	//inject dependency for swimcoach
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
