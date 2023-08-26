package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public String getName(String name) {
        System.out.println(name);
        return name;
    }
}
