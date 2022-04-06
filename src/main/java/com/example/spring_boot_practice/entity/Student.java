package com.example.spring_boot_practice.entity;


import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Component
public class Student {
    @Id
    @SequenceGenerator(name = "student_generator",sequenceName = "stundet_id",allocationSize = 1)
    @GeneratedValue(generator = "student_generator", strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String studentName;
    private String studentSurname;
    private String phoneNumber;
    private String studentEmail;
    private LocalDate dob;
    @OneToOne
    @JoinColumn(name = "cellphoneId")
    private CellPhone cellPhone;

    public Student(String studentName, String studentSurname, String phoneNumber, String studentEmail, LocalDate dob, CellPhone cellPhone) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.phoneNumber = phoneNumber;
        this.studentEmail = studentEmail;
        this.dob = dob;
        this.cellPhone = cellPhone;
    }
}
