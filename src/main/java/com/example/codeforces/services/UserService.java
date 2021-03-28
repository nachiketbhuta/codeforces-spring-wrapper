package com.example.codeforces.services;

import com.example.codeforces.models.users.UserBlogsResponseDTO;
import com.example.codeforces.utilities.CodeforcesInvoker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    CodeforcesInvoker codeforcesInvoker;

    public UserBlogsResponseDTO getBlogs(String username) {
        String url = "https://codeforces.com/api/user.blogEntries?handle=" + username;
        return codeforcesInvoker.codeforcesGetCall(url, UserBlogsResponseDTO.class).getBody();
    }
}
