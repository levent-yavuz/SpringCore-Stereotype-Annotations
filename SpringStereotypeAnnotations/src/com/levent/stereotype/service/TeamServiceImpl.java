package com.levent.stereotype.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.levent.stereotype.dao.TeamDAO;
import com.levent.stereotype.model.Team;

@Service(value = "teamServiceImpl")
public class TeamServiceImpl implements TeamService{

	@Autowired
	TeamDAO teamDAO;

	public void insertTeam(Team team) {
		
		teamDAO.insertTeam(team);
		
//		System.out.println("TeamService inserted Team ");
	}

	@Override
	public void displayTeams() {
		
		teamDAO.displayTeams();	
	}
}
