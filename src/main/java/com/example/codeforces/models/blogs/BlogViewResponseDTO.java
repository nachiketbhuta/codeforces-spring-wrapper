package com.example.codeforces.models.blogs;

import com.example.codeforces.models.BlogEntry;
import lombok.Data;

@Data
public class BlogViewResponseDTO {
    private String status;
    private BlogEntry result;
}
