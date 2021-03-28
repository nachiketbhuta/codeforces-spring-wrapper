package com.example.codeforces.controllers;

import com.example.codeforces.models.RecentActionsResponseDTO;
import com.example.codeforces.utilities.CodeforcesInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @Autowired
    CodeforcesInvoker codeforcesInvoker;

    @GetMapping("/recentActions/{maxCount}")
    public ResponseEntity<RecentActionsResponseDTO> getRecentActions(@PathVariable("maxCount") Integer maxCount) {
        String requestUrl = "https://codeforces.com/api/recentActions?maxCount=" + maxCount;
        return ResponseEntity
                .ok(codeforcesInvoker.codeforcesGetCall(requestUrl, RecentActionsResponseDTO.class).getBody());
    }
}
