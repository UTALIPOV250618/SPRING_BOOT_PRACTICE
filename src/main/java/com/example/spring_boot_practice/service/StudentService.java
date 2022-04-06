package com.example.spring_boot_practice.service;

import com.example.spring_boot_practice.dto.StudentRequest;
import com.example.spring_boot_practice.dto.StudentResponse;
import com.example.spring_boot_practice.entity.Student;
import com.example.spring_boot_practice.mapper.StudentEditMapper;
import com.example.spring_boot_practice.mapper.StudentViewMapper;
import com.example.spring_boot_practice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService  {

    private final StudentEditMapper editMapper;
    private final StudentViewMapper viewMapper;
    private final StudentRepository repository;

    public StudentResponse create(StudentRequest request){

        Student student = editMapper.create(request);
        repository.save(student);
        return viewMapper.viewStudent(student);
    }

    public StudentResponse update(long id,StudentRequest request){

        Student student = repository.findById(id).get();
        editMapper.update(student,request);
        repository.save(student);
        return viewMapper.viewStudent(student);
    }

    public StudentResponse findById(long id){

        Student company = repository.findById(id).get();
        return viewMapper.viewStudent(company);
    }
    public StudentResponse delete(long id){

        Student company = repository.getById(id);
        repository.deleteById(id);
        return viewMapper.viewStudent(company);
    }

    public List<StudentResponse> getAllStudent(){
        return viewMapper.view(repository.findAll());
    }


}
