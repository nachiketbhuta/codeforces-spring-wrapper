package com.example.codeforces.models.problemset;

import com.example.codeforces.models.Submission;
import lombok.Data;

import java.util.List;

@Data
public class RecentStatusResponseDTO {
	private String status;
	private List<Submission> result;
}
