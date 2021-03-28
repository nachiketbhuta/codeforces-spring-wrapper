package com.example.codeforces.models;

import lombok.Data;

@Data
public class ProblemResult {
	private Double points;
	private Integer penalty;
	private Integer rejectedAttemptCount;
	private String type;
	private Integer bestSubmissionTimeSeconds;
}
