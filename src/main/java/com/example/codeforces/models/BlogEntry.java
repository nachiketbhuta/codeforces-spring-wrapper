package com.example.codeforces.models;

import lombok.Data;

import java.util.List;

@Data
public class BlogEntry {
	private Integer id;
	private String originalLocale;
	private Integer creationTimeSeconds;
	private String authorHandle;
	private String title;
	private String content;
	private String locale;
	private Integer modificationTimeSeconds;
	private Boolean allowViewHistory;
	private List<String> tags;
	private Integer rating;
}
