package com.example.spring_boot_practice.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class StudentResponse {

    private String Id;
    private String student_name;
    private String student_surname;
    private String phone_number;
    private String student_email;
    private String cell_phone;
    private LocalDate dob;
}
