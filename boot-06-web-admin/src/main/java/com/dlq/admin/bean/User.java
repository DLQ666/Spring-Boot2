package com.dlq.admin.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *@program: SpringBoot2
 *@description:
 *@author: Hasee
 *@create: 2021-03-30 14:47
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

    private String userName;
    private String password;
}
