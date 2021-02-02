package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class RecentAction {
	private int timeSeconds;
	private BlogEntry blogEntry;
	private Comment comment;

	public RecentAction() {
	}

	public RecentAction(int timeSeconds, BlogEntry blogEntry, Comment comment) {
		super();
		this.timeSeconds = timeSeconds;
		this.blogEntry = blogEntry;
		this.comment = comment;
	}

	public int getTimeSeconds() {
		return timeSeconds;
	}

	public void setTimeSeconds(int timeSeconds) {
		this.timeSeconds = timeSeconds;
	}

	public BlogEntry getBlogEntry() {
		return blogEntry;
	}

	public void setBlogEntry(BlogEntry blogEntry) {
		this.blogEntry = blogEntry;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

}
