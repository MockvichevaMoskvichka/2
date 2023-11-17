package com.example.demo10.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import static java.awt.AWTEventMulticaster.add;

@RestController
@RequestMapping("message")
public class MassegeController {
    public List<Map<String, String>> messages = new ArrayList<Map<String, String>>() {
        {
            add(new HashMap<String, String>() {{
                put("id", "1");
                put("text", "First message");
            }});
            add(new HashMap<String, String>() {{
                put("id", "2");
                put("text", "Second message");
            }});
            add(new HashMap<String, String>() {{
                put("id", "3");
                put("text", "Third message");
            }});
        }};

            @GetMapping
            public List<Map<String, String>> list() {
                {
                    return messages;
                }


            }}