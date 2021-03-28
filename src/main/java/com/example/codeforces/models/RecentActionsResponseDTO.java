package com.example.codeforces.models;

import lombok.Data;

import java.util.List;

@Data
public class RecentActionsResponseDTO {
    private String status;
    private List<RecentAction> result;
}
