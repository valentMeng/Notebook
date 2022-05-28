package com.valent.notebook.service;

import org.springframework.stereotype.Service;

@Service
public class JellyService {

    public int add(int a, int b) {
        return a + b;
    }

    public int minus(int a, int b) {
        return a - b;
    }
}
