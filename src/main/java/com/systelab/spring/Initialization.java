package com.systelab.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initialization implements CommandLineRunner {

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Initialization...");
    }
}