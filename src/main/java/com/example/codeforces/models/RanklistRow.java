package com.example.codeforces.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class RanklistRow {
	private Party party;
	private int rank;
	private double points;
	private int penalty;
	private int successfulHackCount;
	private int unsuccessfulHackCount;
	private List<ProblemResult> problemResults;
	private int lastSubmissionTimeSeconds;

	public RanklistRow() {
	}

	public RanklistRow(Party party, int rank, double points, int penalty, int successfulHackCount,
			int unsuccessfulHackCount, List<ProblemResult> problemResults, int lastSubmissionTimeSeconds) {
		super();
		this.party = party;
		this.rank = rank;
		this.points = points;
		this.penalty = penalty;
		this.successfulHackCount = successfulHackCount;
		this.unsuccessfulHackCount = unsuccessfulHackCount;
		this.problemResults = problemResults;
		this.lastSubmissionTimeSeconds = lastSubmissionTimeSeconds;
	}

	public Party getParty() {
		return party;
	}

	public void setParty(Party party) {
		this.party = party;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public int getSuccessfulHackCount() {
		return successfulHackCount;
	}

	public void setSuccessfulHackCount(int successfulHackCount) {
		this.successfulHackCount = successfulHackCount;
	}

	public int getUnsuccessfulHackCount() {
		return unsuccessfulHackCount;
	}

	public void setUnsuccessfulHackCount(int unsuccessfulHackCount) {
		this.unsuccessfulHackCount = unsuccessfulHackCount;
	}

	public List<ProblemResult> getProblemResults() {
		return problemResults;
	}

	public void setProblemResults(List<ProblemResult> problemResults) {
		this.problemResults = problemResults;
	}

	public int getLastSubmissionTimeSeconds() {
		return lastSubmissionTimeSeconds;
	}

	public void setLastSubmissionTimeSeconds(int lastSubmissionTimeSeconds) {
		this.lastSubmissionTimeSeconds = lastSubmissionTimeSeconds;
	}

}
