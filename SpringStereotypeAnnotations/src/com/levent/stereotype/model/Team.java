package com.levent.stereotype.model;

public class Team {

	private String name;
	private String nickName;
	private String shirtColor;
	private int championshipsWon;
	
	public Team(String name, String nickName, String shirtColor, int championshipsWon) {
		super();
		this.name = name;
		this.nickName = nickName;
		this.shirtColor = shirtColor;
		this.championshipsWon = championshipsWon;
	}

	public Team() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getShirtColor() {
		return shirtColor;
	}

	public void setShirtColor(String shirtColor) {
		this.shirtColor = shirtColor;
	}

	public int getChampionshipsWon() {
		return championshipsWon;
	}

	public void setChampionshipsWon(int championshipsWon) {
		this.championshipsWon = championshipsWon;
	}

	@Override
	public String toString() {
		return "Team [name=" + name + ", nickName=" + nickName + ", shirtColor=" + shirtColor + ", championshipsWon="
				+ championshipsWon + "]";
	}
}
