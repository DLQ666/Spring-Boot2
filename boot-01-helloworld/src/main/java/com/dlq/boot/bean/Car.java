package com.dlq.boot.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-01-09 13:16
 */
@Data
@Component
@ConfigurationProperties(prefix = "mycar")
public class Car {

    private String name;
    private Integer price;

}
