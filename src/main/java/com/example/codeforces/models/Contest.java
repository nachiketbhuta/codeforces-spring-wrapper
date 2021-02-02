package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Contest {
	private int id;
	private String name;
	private String type;
	private String phase;
	private boolean frozen;
	private int durationSeconds;
	private int startTimeSeconds;
	private int relativeTimeSeconds;
	private String preparedBy;
	private String websiteUrl;
	private String description;
	private int difficulty;
	private String kind;
	private String icpcRegion;
	private String country;
	private String city;
	private String season;

	public Contest() {
	}

	public Contest(int id, String name, String type, String phase, boolean frozen, int durationSeconds,
			int startTimeSeconds, int relativeTimeSeconds, String preparedBy, String websiteUrl, String description,
			int difficulty, String kind, String icpcRegion, String country, String city, String season) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.phase = phase;
		this.frozen = frozen;
		this.durationSeconds = durationSeconds;
		this.startTimeSeconds = startTimeSeconds;
		this.relativeTimeSeconds = relativeTimeSeconds;
		this.preparedBy = preparedBy;
		this.websiteUrl = websiteUrl;
		this.description = description;
		this.difficulty = difficulty;
		this.kind = kind;
		this.icpcRegion = icpcRegion;
		this.country = country;
		this.city = city;
		this.season = season;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public boolean isFrozen() {
		return frozen;
	}

	public void setFrozen(boolean frozen) {
		this.frozen = frozen;
	}

	public int getDurationSeconds() {
		return durationSeconds;
	}

	public void setDurationSeconds(int durationSeconds) {
		this.durationSeconds = durationSeconds;
	}

	public int getStartTimeSeconds() {
		return startTimeSeconds;
	}

	public void setStartTimeSeconds(int startTimeSeconds) {
		this.startTimeSeconds = startTimeSeconds;
	}

	public int getRelativeTimeSeconds() {
		return relativeTimeSeconds;
	}

	public void setRelativeTimeSeconds(int relativeTimeSeconds) {
		this.relativeTimeSeconds = relativeTimeSeconds;
	}

	public String getPreparedBy() {
		return preparedBy;
	}

	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}

	public String getWebsiteUrl() {
		return websiteUrl;
	}

	public void setWebsiteUrl(String websiteUrl) {
		this.websiteUrl = websiteUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getIcpcRegion() {
		return icpcRegion;
	}

	public void setIcpcRegion(String icpcRegion) {
		this.icpcRegion = icpcRegion;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
