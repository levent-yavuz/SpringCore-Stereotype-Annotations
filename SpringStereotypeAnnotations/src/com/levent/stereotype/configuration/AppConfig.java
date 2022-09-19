package com.levent.stereotype.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.levent.stereotype.model.Team;

@Configuration
@ComponentScan(basePackages = "com.levent.stereotype")
public class AppConfig {
	
	@Bean
	public Team team1() {
		
		return new Team("Manchester City", "The Sky Blues", "Blue and White", 6);
	}
	@Bean
	public Team team2() {
			
			return new Team("Liverpool", "The Reds", "Red", 19);
		}
	@Bean
	public Team team3() {
		
		return new Team("Manchester United", "The Red Devils ", "Red and White", 20);
	}
	@Bean
	public Team team4() {
		
		return new Team("Chelsea", "The Blues", "White and Blue", 6);
	}

}
