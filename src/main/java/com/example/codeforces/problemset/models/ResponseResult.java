package com.example.codeforces.problemset.models;

import java.util.List;

import com.example.codeforces.models.Problem;
import com.example.codeforces.models.ProblemStatistics;

public class ResponseResult {
	private List<Problem> problems;
	private List<ProblemStatistics> problemStatistics;

	public ResponseResult() {
	}

	public ResponseResult(List<Problem> problems, List<ProblemStatistics> problemStatistics) {
		super();
		this.problems = problems;
		this.problemStatistics = problemStatistics;
	}

	public List<Problem> getProblems() {
		return problems;
	}

	public void setProblems(List<Problem> problems) {
		this.problems = problems;
	}

	public List<ProblemStatistics> getProblemStatistics() {
		return problemStatistics;
	}

	public void setProblemStatistics(List<ProblemStatistics> problemStatistics) {
		this.problemStatistics = problemStatistics;
	}

}
