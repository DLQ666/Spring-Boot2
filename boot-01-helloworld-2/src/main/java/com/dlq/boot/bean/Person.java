package com.dlq.boot.bean;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-01-22 19:32
 */
@ConfigurationProperties(prefix = "person")
@Component
@Data
@NoArgsConstructor
public class Person {

    private String userName;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> animal;
    private Map<String, Object> score;
    private Set<Double> salarys;
    private Map<String, List<Pet>> allPets;
}
