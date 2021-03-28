package com.example.codeforces.models.contest;

import com.example.codeforces.models.Contest;
import lombok.Data;

import java.util.List;

@Data
public class ContestListResponseDTO {
    private String status;
    private List<Contest> result;
}
