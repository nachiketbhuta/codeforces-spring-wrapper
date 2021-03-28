package com.example.codeforces.models.contest;

import com.example.codeforces.models.RatingChange;
import lombok.Data;

import java.util.List;

@Data
public class ContestRatingChangesResponseDTO {
    private String status;
    private List<RatingChange> result;
}
