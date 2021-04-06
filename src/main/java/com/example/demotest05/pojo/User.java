package com.example.demotest05.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//编写pojo实体类
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String userName;
    private String password;
}