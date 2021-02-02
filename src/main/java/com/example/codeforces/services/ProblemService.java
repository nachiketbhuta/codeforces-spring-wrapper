package com.example.codeforces.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.codeforces.models.problemset.ProblemResponseDTO;
import com.example.codeforces.models.problemset.RecentStatusResponseDTO;

@Service
public class ProblemService {
	@Autowired
	private RestTemplate restTemplate;

	public ProblemResponseDTO getProblemsByTags(String tags) {
		String requestUrl = "http://codeforces.com/api/problemset.problems";
		if (!tags.isEmpty()) {
			requestUrl = requestUrl + "?tags=" + tags;
		}
		ProblemResponseDTO response = restTemplate.getForObject(requestUrl, ProblemResponseDTO.class);
		return response;
	}

	public RecentStatusResponseDTO getRecentStatus(int count) {
		String requestUrl = "http://codeforces.com/api/problemset.recentStatus?count=" + count;
		RecentStatusResponseDTO response = restTemplate.getForObject(requestUrl, RecentStatusResponseDTO.class);
		return response;
	}
}
