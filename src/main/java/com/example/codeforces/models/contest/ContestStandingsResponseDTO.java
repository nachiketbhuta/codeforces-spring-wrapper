package com.example.codeforces.models.contest;

import lombok.Data;

@Data
public class ContestStandingsResponseDTO {
    private String status;
    private ContestStandings result;
}
