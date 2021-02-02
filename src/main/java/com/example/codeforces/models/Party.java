package com.example.codeforces.models;

import java.lang.reflect.Member;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Party {
	private int contestId;
	private List<Member> members;
	private String participantType;
	private int teamId;
	private String teamName;
	private boolean ghost;
	private int room;
	private int startTimeSeconds;

	public Party() {
	}

	public Party(int contestId, List<Member> members, String participantType, int teamId, String teamName,
			boolean ghost, int room, int startTimeSeconds) {
		super();
		this.contestId = contestId;
		this.members = members;
		this.participantType = participantType;
		this.teamId = teamId;
		this.teamName = teamName;
		this.ghost = ghost;
		this.room = room;
		this.startTimeSeconds = startTimeSeconds;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public String getParticipantType() {
		return participantType;
	}

	public void setParticipantType(String participantType) {
		this.participantType = participantType;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public boolean isGhost() {
		return ghost;
	}

	public void setGhost(boolean ghost) {
		this.ghost = ghost;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public int getStartTimeSeconds() {
		return startTimeSeconds;
	}

	public void setStartTimeSeconds(int startTimeSeconds) {
		this.startTimeSeconds = startTimeSeconds;
	}

}
