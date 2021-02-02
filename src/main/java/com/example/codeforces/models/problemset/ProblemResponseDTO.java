package com.example.codeforces.models.problemset;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ProblemResponseDTO {
	private String status;
	private ProblemsResponseResult result;

	public ProblemResponseDTO() {
	}

	public ProblemResponseDTO(String status, ProblemsResponseResult result) {
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

	public ProblemsResponseResult getResult() {
		return result;
	}

	public void setResult(ProblemsResponseResult result) {
		this.result = result;
	}

}
