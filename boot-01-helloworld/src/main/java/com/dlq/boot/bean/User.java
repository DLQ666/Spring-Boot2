package com.dlq.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-01-08 18:41
 */
@NoArgsConstructor
@Data
public class User {

    private String name;
    private Integer age;

    private Pet pet;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
