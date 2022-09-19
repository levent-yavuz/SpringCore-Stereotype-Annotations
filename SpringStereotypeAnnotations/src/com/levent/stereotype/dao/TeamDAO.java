package com.levent.stereotype.dao;

import java.util.ArrayList;
import java.util.List;

import com.levent.stereotype.model.Team;

public interface TeamDAO {

	List<Team> teams = new ArrayList<Team>();
	
	void insertTeam(Team team);
	
	void displayTeams();
	
}
