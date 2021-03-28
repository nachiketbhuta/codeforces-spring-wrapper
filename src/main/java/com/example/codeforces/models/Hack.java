package com.example.codeforces.models;

import lombok.Data;

@Data
public class Hack {
	private Integer id;
	private Integer creationTimeSeconds;
	private Party hacker;
	private Party defender;
	private String verdict;
	private Problem problem;
	private String test;
	private JudgeProtocol judgeProtocol;
}
