package com.example.spring_boot_practice.mapper;

import com.example.spring_boot_practice.dto.StudentResponse;
import com.example.spring_boot_practice.entity.Student;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class StudentViewMapper {

    public StudentResponse viewStudent(Student student){
        if (student == null) {
            return  null;
        }
        StudentResponse response = new StudentResponse();

        if (student.getId() != null) {
            response.setId(String.valueOf(student.getId()));
        }
        response.setCell_phone(String.valueOf(student.getCellPhone()));
        response.setStudent_name(student.getStudentName());
        response.setStudent_surname(student.getStudentSurname());
        response.setStudent_email(student.getStudentEmail());
        response.setPhone_number(student.getPhoneNumber());
        response.setCell_phone(String.valueOf(student.getCellPhone()));
        response.setDob(student.getDob());
        return response;
    }
    public List<StudentResponse> view(List<Student> students ){

        List<StudentResponse> responses  =new ArrayList<>();
        for (Student c:students
        ) {
            responses.add(viewStudent(c));
        }

        return responses;
    }

}
