package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Comment {
	private int id;
	private int creationTimeSeconds;
	private String commentatorHandle;
	private String locale;
	private String text;
	private int parentCommentId;
	private int rating;

	public Comment() {
	}

	public Comment(int id, int creationTimeSeconds, String commentatorHandle, String locale, String text,
			int parentCommentId, int rating) {
		super();
		this.id = id;
		this.creationTimeSeconds = creationTimeSeconds;
		this.commentatorHandle = commentatorHandle;
		this.locale = locale;
		this.text = text;
		this.parentCommentId = parentCommentId;
		this.rating = rating;
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

	public String getCommentatorHandle() {
		return commentatorHandle;
	}

	public void setCommentatorHandle(String commentatorHandle) {
		this.commentatorHandle = commentatorHandle;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getParentCommentId() {
		return parentCommentId;
	}

	public void setParentCommentId(int parentCommentId) {
		this.parentCommentId = parentCommentId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
