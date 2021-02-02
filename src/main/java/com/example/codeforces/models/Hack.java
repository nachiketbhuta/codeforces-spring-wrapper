package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Hack {
	private int id;
	private int creationTimeSeconds;
	private Party hacker;
	private Party defender;
	private String verdict;
	private Problem problem;
	private String test;
	private JudgeProtocol judgeProtocol;

	public Hack() {
	}

	public Hack(int id, int creationTimeSeconds, Party hacker, Party defender, String verdict, Problem problem,
			String test, JudgeProtocol judgeProtocol) {
		super();
		this.id = id;
		this.creationTimeSeconds = creationTimeSeconds;
		this.hacker = hacker;
		this.defender = defender;
		this.verdict = verdict;
		this.problem = problem;
		this.test = test;
		this.judgeProtocol = judgeProtocol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreationTimeSeconds() {
		return creationTimeSeconds;
	}

	public void setCreationTimeSeconds(int creationTimeSeconds) {
		this.creationTimeSeconds = creationTimeSeconds;
	}

	public Party getHacker() {
		return hacker;
	}

	public void setHacker(Party hacker) {
		this.hacker = hacker;
	}

	public Party getDefender() {
		return defender;
	}

	public void setDefender(Party defender) {
		this.defender = defender;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public JudgeProtocol getJudgeProtocol() {
		return judgeProtocol;
	}

	public void setJudgeProtocol(JudgeProtocol judgeProtocol) {
		this.judgeProtocol = judgeProtocol;
	}

}
