package com.example.codeforces.models.contest;

import com.example.codeforces.models.Submission;
import lombok.Data;

import java.util.List;

@Data
public class ContestStatusResponseDTO {
    private String status;
    private List<Submission> result;
}
