package com.example.codeforces.models.contest;

import com.example.codeforces.models.Contest;
import com.example.codeforces.models.Problem;
import com.example.codeforces.models.RanklistRow;
import lombok.Data;

import java.util.List;

@Data
public class ContestStandings {
    private Contest contest;
    private List<Problem> problems;
    private List<RanklistRow> rows;
}
