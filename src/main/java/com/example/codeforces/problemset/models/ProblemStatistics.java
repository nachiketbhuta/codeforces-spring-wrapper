package com.example.codeforces.problemset.models;

public class ProblemStatistics extends BaseProblem {
	private int solvedCount;

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

}
