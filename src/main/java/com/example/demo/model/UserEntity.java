package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class UserEntity { 
    String id = "1"; 
    String name = "Darshan.G.Pawar"; 
    String userName = "@drash"; 
    String email = "drash@geek"; 
    String pincode = "422-009"; 
}
