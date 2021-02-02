package com.example.codeforces.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeforces.models.problemset.ProblemResponseDTO;
import com.example.codeforces.models.problemset.RecentStatusResponseDTO;
import com.example.codeforces.services.ProblemService;

@RestController
@RequestMapping("/problemset")
public class ProblemsController {

	@Autowired
	private ProblemService problemService;

	@GetMapping("/problems")
	public ResponseEntity<ProblemResponseDTO> getProblems(@RequestParam("tags") String tags) {
		ProblemResponseDTO response = problemService.getProblemsByTags(tags);
		return ResponseEntity.ok(response);
	}

	@GetMapping("/status")
	public ResponseEntity<RecentStatusResponseDTO> getRecentStatus(@RequestParam("count") int count) {
		RecentStatusResponseDTO response = problemService.getRecentStatus(count);
		return ResponseEntity.ok(response);
	}

}
