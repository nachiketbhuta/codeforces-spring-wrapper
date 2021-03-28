package com.example.codeforces.models;

import lombok.Data;

@Data
public class Comment {
	private Integer id;
	private Integer creationTimeSeconds;
	private String commentatorHandle;
	private String locale;
	private String text;
	private Integer parentCommentId;
	private Integer rating;
}
