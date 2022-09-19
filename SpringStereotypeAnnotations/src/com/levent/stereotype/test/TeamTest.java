package com.levent.stereotype.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.levent.stereotype.configuration.AppConfig;
import com.levent.stereotype.model.Team;
import com.levent.stereotype.service.TeamService;
import com.levent.stereotype.service.TeamServiceImpl;

public class TeamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TeamService teamService = context.getBean("teamServiceImpl", TeamServiceImpl.class);
		
		Team team1 = context.getBean("team1",Team.class);
		Team team2 = context.getBean("team2",Team.class);
		Team team3 = context.getBean("team3",Team.class);
		Team team4 = context.getBean("team4",Team.class);
		
		teamService.insertTeam(team1);
		teamService.insertTeam(team2);
		teamService.insertTeam(team3);
		teamService.insertTeam(team4);
		
		teamService.displayTeams();	
	}
}
