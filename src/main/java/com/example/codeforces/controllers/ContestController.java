package com.example.codeforces.controllers;

import com.example.codeforces.models.contest.*;
import com.example.codeforces.services.ContestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contests")
public class ContestController {

    @Autowired
    ContestService contestService;

    @GetMapping("/all")
    public ResponseEntity<ContestListResponseDTO>
        getContestList(@RequestParam("gym") Boolean gym) {
        return ResponseEntity.ok(contestService.getContestList(gym));
    }

    @GetMapping("/{contestId}/hacks")
    public ResponseEntity<HacksListResponseDTO>
        getHacks(@PathVariable("contestId") Integer contestId) {
        return ResponseEntity.ok(contestService.getHacks(contestId));
    }

    @GetMapping("/{contestId}/ratings/changes")
    public ResponseEntity<ContestRatingChangesResponseDTO>
        getRatingChanges(@PathVariable("contestId") Integer contestId) {
        return ResponseEntity.ok(contestService.getRatingChanges(contestId));
    }

    @GetMapping("/{contestId}/{from}/{count}/{unofficial}/standings")
    public ResponseEntity<ContestStandingsResponseDTO> getStandings(
            @PathVariable("contestId") Integer contestId,
            @PathVariable("from") Integer from,
            @PathVariable("count") Integer count,
            @PathVariable("unofficial") Boolean unofficial) {
        return ResponseEntity.ok(contestService.getStandings(contestId, from, count, unofficial));
    }

    @GetMapping("/{contestId}/{from}/{count}/status")
    public ResponseEntity<ContestStatusResponseDTO> getStatus(
            @PathVariable("contestId") Integer contestId,
            @PathVariable("from") Integer from,
            @PathVariable("count") Integer count) {
        return ResponseEntity.ok(contestService.getStatus(contestId, from, count));
    }

}
