package com.example.codeforces.utilities;

import com.example.codeforces.models.CodeforcesSecrets;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class CodeforcesInvoker {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    CodeforcesSecrets codeforcesSecrets;

    public <T> ResponseEntity<T> codeforcesGetCall(String url, Class<T> returnClass) {
        return restTemplate.exchange(url, HttpMethod.GET, null, returnClass);
    }

    public static String sha512(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest md5 = MessageDigest.getInstance("SHA-512");
        byte[] digest = md5.digest(input.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digest.length; ++i) {
            sb.append(Integer.toHexString((digest[i] & 0xFF) | 0x100).substring(1, 3));
        }
        return sb.toString();
    }
}
