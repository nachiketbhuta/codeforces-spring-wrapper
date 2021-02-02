package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Member {
	private String handle;

	public Member() {
	}

	public Member(String handle) {
		super();
		this.handle = handle;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

}
