package com.example.codeforces.models;

import lombok.Data;

import java.util.List;

@Data
public class RanklistRow {
	private Party party;
	private Integer rank;
	private Double points;
	private Integer penalty;
	private Integer successfulHackCount;
	private Integer unsuccessfulHackCount;
	private List<ProblemResult> problemResults;
	private Integer lastSubmissionTimeSeconds;
}
