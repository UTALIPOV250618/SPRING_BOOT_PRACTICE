package com.example.spring_boot_practice.mapper;

import com.example.spring_boot_practice.dto.StudentRequest;
import com.example.spring_boot_practice.entity.CellPhone;
import com.example.spring_boot_practice.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class StudentEditMapper {

    public Student create (StudentRequest request){
        if (request == null) {
            return null;
        }
        Student student = new Student();
        student.setStudentName(request.getStudent_name());
        student.setStudentSurname(request.getStudent_surname());
        student.setStudentEmail(request.getStudent_email());
        student.setPhoneNumber(request.getPhone_number());
        student.setDob(LocalDate.now());

        return student;
    }
    public Student update(Student student,StudentRequest request){
        student.setStudentName(request.getStudent_name());
        student.setStudentSurname(request.getStudent_surname());
        student.setStudentEmail(request.getStudent_email());
        student.setPhoneNumber(request.getPhone_number());
        return student;
    }
}
