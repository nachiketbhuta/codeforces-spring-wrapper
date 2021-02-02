package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Submission {
	private int id;
	private int contestId;
	private int creationTimeSeconds;
	private int relativeTimeSeconds;
	private Problem problem;
	private Party author;
	private String programmingLanguage;
	private String verdict;
	private String testset;
	private int passedTestCount;
	private int timeConsumedMillis;
	private int memoryConsumedBytes;
	private double points;

	public Submission() {
		super();
	}

	public Submission(int id, int contestId, int creationTimeSeconds, int relativeTimeSeconds, Problem problem,
			Party author, String programmingLanguage, String verdict, String testset, int passedTestCount,
			int timeConsumedMillis, int memoryConsumedBytes, double points) {
		super();
		this.id = id;
		this.contestId = contestId;
		this.creationTimeSeconds = creationTimeSeconds;
		this.relativeTimeSeconds = relativeTimeSeconds;
		this.problem = problem;
		this.author = author;
		this.programmingLanguage = programmingLanguage;
		this.verdict = verdict;
		this.testset = testset;
		this.passedTestCount = passedTestCount;
		this.timeConsumedMillis = timeConsumedMillis;
		this.memoryConsumedBytes = memoryConsumedBytes;
		this.points = points;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public int getCreationTimeSeconds() {
		return creationTimeSeconds;
	}

	public void setCreationTimeSeconds(int creationTimeSeconds) {
		this.creationTimeSeconds = creationTimeSeconds;
	}

	public int getRelativeTimeSeconds() {
		return relativeTimeSeconds;
	}

	public void setRelativeTimeSeconds(int relativeTimeSeconds) {
		this.relativeTimeSeconds = relativeTimeSeconds;
	}

	public Problem getProblem() {
		return problem;
	}

	public void setProblem(Problem problem) {
		this.problem = problem;
	}

	public Party getAuthor() {
		return author;
	}

	public void setAuthor(Party author) {
		this.author = author;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

	public String getTestset() {
		return testset;
	}

	public void setTestset(String testset) {
		this.testset = testset;
	}

	public int getPassedTestCount() {
		return passedTestCount;
	}

	public void setPassedTestCount(int passedTestCount) {
		this.passedTestCount = passedTestCount;
	}

	public int getTimeConsumedMillis() {
		return timeConsumedMillis;
	}

	public void setTimeConsumedMillis(int timeConsumedMillis) {
		this.timeConsumedMillis = timeConsumedMillis;
	}

	public int getMemoryConsumedBytes() {
		return memoryConsumedBytes;
	}

	public void setMemoryConsumedBytes(int memoryConsumedBytes) {
		this.memoryConsumedBytes = memoryConsumedBytes;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

}
