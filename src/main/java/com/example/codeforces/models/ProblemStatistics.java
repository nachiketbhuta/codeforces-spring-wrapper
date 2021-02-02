package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ProblemStatistics {
	private int solvedCount;
	private int contestId;
	private String index;

	public ProblemStatistics() {
	}

	public ProblemStatistics(int solvedCount) {
		super();
		this.solvedCount = solvedCount;
	}

	public int getSolvedCount() {
		return solvedCount;
	}

	public void setSolvedCount(int solvedCount) {
		this.solvedCount = solvedCount;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

}
