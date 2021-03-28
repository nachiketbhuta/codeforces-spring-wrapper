package com.example.codeforces.models.problemset;

import com.example.codeforces.models.Problem;
import com.example.codeforces.models.ProblemStatistics;
import lombok.Data;

import java.util.List;

@Data
public class ProblemsResponseResult {
	private List<Problem> problems;
	private List<ProblemStatistics> problemStatistics;
}
