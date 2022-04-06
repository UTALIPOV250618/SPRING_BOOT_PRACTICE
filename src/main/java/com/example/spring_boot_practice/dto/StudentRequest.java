package com.example.spring_boot_practice.dto;


import com.example.spring_boot_practice.entity.CellPhone;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StudentRequest {


    private String student_name;
    private String student_surname;
    private String phone_number;
    private String student_email;
    private CellPhone cell_phone;


}
