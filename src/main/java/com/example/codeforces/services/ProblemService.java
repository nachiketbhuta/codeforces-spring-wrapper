package com.example.codeforces.services;

import com.example.codeforces.models.problemset.ProblemResponseDTO;
import com.example.codeforces.models.problemset.RecentStatusResponseDTO;
import com.example.codeforces.utilities.CodeforcesInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProblemService {

	@Autowired
	CodeforcesInvoker codeforcesInvoker;

	public ProblemResponseDTO getProblemsByTags(String tags) {
		String requestUrl = "http://codeforces.com/api/problemset.problems";
		if (!tags.isEmpty()) {
			requestUrl = requestUrl + "?tags=" + tags;
		}
		return codeforcesInvoker.codeforcesGetCall(requestUrl, ProblemResponseDTO.class).getBody();

	}

	public RecentStatusResponseDTO getRecentStatus(Integer count) {
		String requestUrl = "http://codeforces.com/api/problemset.recentStatus?count=" + count;
		return codeforcesInvoker.codeforcesGetCall(requestUrl, RecentStatusResponseDTO.class).getBody();
	}


}
