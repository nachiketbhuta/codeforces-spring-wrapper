package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ProblemResult {
	private double points;
	private int penalty;
	private int rejectedAttemptCount;
	private String type;
	private int bestSubmissionTimeSeconds;

	public ProblemResult() {
	}

	public ProblemResult(double points, int penalty, int rejectedAttemptCount, String type,
			int bestSubmissionTimeSeconds) {
		super();
		this.points = points;
		this.penalty = penalty;
		this.rejectedAttemptCount = rejectedAttemptCount;
		this.type = type;
		this.bestSubmissionTimeSeconds = bestSubmissionTimeSeconds;
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

	public int getRejectedAttemptCount() {
		return rejectedAttemptCount;
	}

	public void setRejectedAttemptCount(int rejectedAttemptCount) {
		this.rejectedAttemptCount = rejectedAttemptCount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getBestSubmissionTimeSeconds() {
		return bestSubmissionTimeSeconds;
	}

	public void setBestSubmissionTimeSeconds(int bestSubmissionTimeSeconds) {
		this.bestSubmissionTimeSeconds = bestSubmissionTimeSeconds;
	}

}
