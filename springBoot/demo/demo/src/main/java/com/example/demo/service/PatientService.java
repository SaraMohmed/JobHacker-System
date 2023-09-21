package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

    public static String printName(String Name){
        return Name.toUpperCase();
    }
}
