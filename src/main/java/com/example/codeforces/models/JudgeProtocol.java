package com.example.codeforces.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class JudgeProtocol {
	private boolean manual;
	private String protocol;
	private String verdict;

	public JudgeProtocol() {
	}

	public JudgeProtocol(boolean manual, String protocol, String verdict) {
		super();
		this.manual = manual;
		this.protocol = protocol;
		this.verdict = verdict;
	}

	public boolean isManual() {
		return manual;
	}

	public void setManual(boolean manual) {
		this.manual = manual;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getVerdict() {
		return verdict;
	}

	public void setVerdict(String verdict) {
		this.verdict = verdict;
	}

}
