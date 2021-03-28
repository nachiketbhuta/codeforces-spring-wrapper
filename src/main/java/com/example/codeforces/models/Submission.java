package com.example.codeforces.models;

import lombok.Data;

@Data
public class Submission {
	private Integer id;
	private Integer contestId;
	private Integer creationTimeSeconds;
	private Integer relativeTimeSeconds;
	private Problem problem;
	private Party author;
	private String programmingLanguage;
	private String verdict;
	private String testset;
	private Integer passedTestCount;
	private Integer timeConsumedMillis;
	private Integer memoryConsumedBytes;
	private Double points;
}
