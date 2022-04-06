package com.example.spring_boot_practice.controller;

import com.example.spring_boot_practice.dto.StudentRequest;
import com.example.spring_boot_practice.dto.StudentResponse;
import com.example.spring_boot_practice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping( "api/v1/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;
    @GetMapping
    public List<StudentResponse> getAllStudent(){
        return service.getAllStudent();
    }

    @PostMapping
    public StudentResponse add(@RequestBody StudentRequest request){
        return service.create(request);
    }

    @PutMapping("/{id}")
    public StudentResponse update(
            @PathVariable long id,@RequestBody StudentRequest request){
        return  service.update(id,request);
    }
    @GetMapping("/{id}")
    public StudentResponse getById(@PathVariable long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public StudentResponse delete(@PathVariable long id){
        return service.delete(id);
    }
}
