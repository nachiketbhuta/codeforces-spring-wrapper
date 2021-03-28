package com.example.codeforces.models.users;

import com.example.codeforces.models.BlogEntry;
import lombok.Data;

import java.util.List;

@Data
public class UserBlogsResponseDTO {
    private String status;
    private List<BlogEntry> result;
}
