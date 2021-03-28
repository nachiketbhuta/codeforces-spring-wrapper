package com.example.codeforces.models.blogs;

import com.example.codeforces.models.Comment;
import lombok.Data;

import java.util.List;

@Data
public class BlogCommentsResponseDTO {
    private String status;
    private List<Comment> result;
}
