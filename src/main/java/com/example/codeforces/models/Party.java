package com.example.codeforces.models;

import lombok.Data;

import java.util.List;

@Data
public class Party {
	private Integer contestId;
	private List<Member> members;
	private String participantType;
	private Integer teamId;
	private String teamName;
	private Boolean ghost;
	private Integer room;
	private Integer startTimeSeconds;
}
