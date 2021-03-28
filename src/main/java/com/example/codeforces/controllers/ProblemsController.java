package com.example.codeforces.controllers;

import com.example.codeforces.models.problemset.ProblemResponseDTO;
import com.example.codeforces.models.problemset.RecentStatusResponseDTO;
import com.example.codeforces.services.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/problemset")
public class ProblemsController {

	@Autowired
	private ProblemService problemService;

	@GetMapping("/problems")
	public ResponseEntity<ProblemResponseDTO> getProblems(@RequestParam("tags") String tags) {
		return ResponseEntity.ok(problemService.getProblemsByTags(tags));
	}

	@GetMapping("/status")
	public ResponseEntity<RecentStatusResponseDTO> getRecentStatus(@RequestParam("count") Integer count) {
		return ResponseEntity.ok(problemService.getRecentStatus(count));
	}


}
