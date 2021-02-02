package com.example.codeforces.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Problem {
	private String problemsetName;
	private String name;
	private String type;
	private double points;
	private int rating;
	private List<String> tags;

	private int contestId;
	private String index;

	public Problem() {
	}

	public Problem(String problemsetName, String name, String type, double points, int rating, List<String> tags,
			int contestId, String index) {
		super();
		this.problemsetName = problemsetName;
		this.name = name;
		this.type = type;
		this.points = points;
		this.rating = rating;
		this.tags = tags;
		this.contestId = contestId;
		this.index = index;
	}

	public String getProblemsetName() {
		return problemsetName;
	}

	public void setProblemsetName(String problemsetName) {
		this.problemsetName = problemsetName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public int getContestId() {
		return contestId;
	}

	public void setContestId(int contestId) {
		this.contestId = contestId;
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}
}
