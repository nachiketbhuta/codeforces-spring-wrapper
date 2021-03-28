package com.example.codeforces.models;

import lombok.Data;

@Data
public class Contest {
	private Integer id;
	private String name;
	private String type;
	private String phase;
	private Boolean frozen;
	private Integer durationSeconds;
	private Integer startTimeSeconds;
	private Integer relativeTimeSeconds;
	private String preparedBy;
	private String websiteUrl;
	private String description;
	private Integer difficulty;
	private String kind;
	private String icpcRegion;
	private String country;
	private String city;
	private String season;
}
