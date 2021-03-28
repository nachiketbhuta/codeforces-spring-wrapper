package com.example.codeforces.models;

import lombok.Data;

@Data
public class User {
	private String handle;
	private String email;
	private String vkId;
	private String openId;
	private String firstName;
	private String lastName;
	private String country;
	private String city;
	private String organization;
	private Integer contribution;
	private String rank;
	private Integer rating;
	private String maxRank;
	private Integer maxRating;
	private Integer lastOnlineTimeSeconds;
	private Integer registrationTimeSeconds;
	private Integer friendOfCount;
	private String avatar;
	private String titlePhoto;
}
