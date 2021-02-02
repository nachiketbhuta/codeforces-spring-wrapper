package com.example.codeforces.problemset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.codeforces.problemset.models.ProblemResponseDTO;

@RestController
@RequestMapping("/problemset")
public class ProblemsController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/")
	public ResponseEntity<ProblemResponseDTO> getProblems() {
		ProblemResponseDTO response = restTemplate.getForObject("http://codeforces.com/api/problemset.problems",
				ProblemResponseDTO.class);
		return ResponseEntity.ok(response);
	}
}
