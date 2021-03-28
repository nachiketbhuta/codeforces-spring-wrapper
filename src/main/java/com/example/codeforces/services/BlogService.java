package com.example.codeforces.services;

import com.example.codeforces.models.blogs.BlogCommentsResponseDTO;
import com.example.codeforces.models.blogs.BlogViewResponseDTO;
import com.example.codeforces.utilities.CodeforcesInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogService {

    @Autowired
    CodeforcesInvoker codeforcesInvoker;


    public BlogCommentsResponseDTO getBlogComments(Integer blogId) {
        String requestUrl = "https://codeforces.com/api/blogEntry.comments?blogEntryId=" + blogId;
        return codeforcesInvoker.codeforcesGetCall(requestUrl, BlogCommentsResponseDTO.class).getBody();
    }

    public BlogViewResponseDTO getBlogView(Integer blogId) {
        String requestUrl = "https://codeforces.com/api/blogEntry.view?blogEntryId=" + blogId;
        return codeforcesInvoker.codeforcesGetCall(requestUrl, BlogViewResponseDTO.class).getBody();
    }
}
