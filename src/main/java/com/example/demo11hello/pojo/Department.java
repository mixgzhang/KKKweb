package com.example.demo11hello.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor     //有参构造
@NoArgsConstructor      //无参构造
public class Department {
    private Integer id;
    private String departmentName;
}
