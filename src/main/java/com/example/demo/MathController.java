package com.example.demo;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
public class MathController {

    @GetMapping(value = "/msl/add", produces = "text/plain;charset=UTF-8")
    public ResponseEntity<String> add(
            @RequestParam("a") int a,
            @RequestParam("b") int b) {
        int sum = a + b;
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("text", "plain", StandardCharsets.UTF_8));
        return new ResponseEntity<>(String.valueOf(sum), headers, HttpStatus.OK);
    }
}
