package com.example.codeforces.models;

import lombok.Data;

@Data
public class RatingChange {
	private Integer contestId;
	private String contestName;
	private String handle;
	private Integer rank;
	private Integer ratingUpdateTimeSeconds;
	private Integer oldRating;
	private Integer newRating;
}
