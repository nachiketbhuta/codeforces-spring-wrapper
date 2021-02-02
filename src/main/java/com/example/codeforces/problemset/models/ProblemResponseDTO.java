package com.example.codeforces.problemset.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class ProblemResponseDTO {
	private String status;
	private ResponseResult result;

	public ProblemResponseDTO() {
	}

	public ProblemResponseDTO(String status, ResponseResult result) {
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

	public ResponseResult getResult() {
		return result;
	}

	public void setResult(ResponseResult result) {
		this.result = result;
	}

}
