package com.example.codeforces.models.contest;

import com.example.codeforces.models.Hack;
import lombok.Data;

import java.util.List;

@Data
public class HacksListResponseDTO {
    private String status;
    private List<Hack> result;
}
