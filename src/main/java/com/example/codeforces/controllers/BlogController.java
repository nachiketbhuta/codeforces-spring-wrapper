package com.example.codeforces.controllers;

import com.example.codeforces.models.blogs.BlogCommentsResponseDTO;
import com.example.codeforces.models.blogs.BlogViewResponseDTO;
import com.example.codeforces.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    BlogService blogService;

    @GetMapping("/{blogId}/comments")
    public ResponseEntity<BlogCommentsResponseDTO>
            getBlogComments(@PathVariable("blogId") Integer blogId) {
        return ResponseEntity.ok(blogService.getBlogComments(blogId));
    }

    @GetMapping("/{blogId}/view")
    public ResponseEntity<BlogViewResponseDTO>
            getBlogView(@PathVariable("blogId") Integer blogId) {
        return ResponseEntity.ok(blogService.getBlogView(blogId));
    }
}
