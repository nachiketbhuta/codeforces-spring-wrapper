package com.example.codeforces.models.problemset;

import java.util.List;

import com.example.codeforces.models.Submission;

public class RecentStatusResponseDTO {
	private String status;
	private List<Submission> result;

	public RecentStatusResponseDTO() {
	}

	public RecentStatusResponseDTO(String status, List<Submission> result) {
		super();
		this.status = status;
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Submission> getResult() {
		return result;
	}

	public void setResult(List<Submission> result) {
		this.result = result;
	}

}
