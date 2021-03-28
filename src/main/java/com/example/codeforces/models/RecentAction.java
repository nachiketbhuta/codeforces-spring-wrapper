package com.example.codeforces.models;

import lombok.Data;

@Data
public class RecentAction {
	private Integer timeSeconds;
	private BlogEntry blogEntry;
	private Comment comment;
}
