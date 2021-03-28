package com.example.codeforces.models;

import lombok.Data;

import java.util.List;

@Data
public class Problem {
	private String problemsetName;
	private String name;
	private String type;
	private Double points;
	private Integer rating;
	private List<String> tags;
	private Integer contestId;
	private String index;
}
