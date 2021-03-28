package com.example.codeforces.services;

import com.example.codeforces.models.contest.*;
import com.example.codeforces.utilities.CodeforcesInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContestService {

    @Autowired
    CodeforcesInvoker codeforcesInvoker;


    public ContestListResponseDTO getContestList(Boolean gym) {
        String requestUrl = "http://codeforces.com/api/contest.list";
        if (gym) {
            requestUrl = requestUrl + "?gym=true";
        }

        return codeforcesInvoker.codeforcesGetCall(requestUrl, ContestListResponseDTO.class).getBody();
    }

    public HacksListResponseDTO getHacks(Integer contestId) {
        String requestUrl = "http://codeforces.com/api/contest.hacks?contestId=" + contestId;
        return codeforcesInvoker.codeforcesGetCall(requestUrl, HacksListResponseDTO.class).getBody();
    }

    public ContestRatingChangesResponseDTO getRatingChanges(Integer contestId) {
        String requestUrl = "http://codeforces.com/api/contest.ratingChanges?contestId=" + contestId;
        return codeforcesInvoker.codeforcesGetCall(requestUrl, ContestRatingChangesResponseDTO.class).getBody();
    }

    public ContestStandingsResponseDTO getStandings(Integer contestId, Integer from, Integer count, Boolean unofficial) {
        String requestUrl =
                "http://codeforces.com/api/contest.standings?contestId=" + contestId
                + "&from=" + from
                + "&count=" + count
                + "&showUnofficial=" + unofficial;
        return codeforcesInvoker.codeforcesGetCall(requestUrl, ContestStandingsResponseDTO.class).getBody();
    }

    public ContestStatusResponseDTO getStatus(Integer contestId, Integer from, Integer count) {
        String requestUrl =
                "http://codeforces.com/api/contest.status?contestId=" + contestId
                        + "&from=" + from
                        + "&count=" + count;
        return codeforcesInvoker.codeforcesGetCall(requestUrl, ContestStatusResponseDTO.class).getBody();
    }
}
