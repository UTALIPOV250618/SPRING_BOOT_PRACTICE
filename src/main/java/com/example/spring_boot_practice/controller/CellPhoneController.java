package com.example.spring_boot_practice.controller;


import com.example.spring_boot_practice.dto.CellPhoneRequest;
import com.example.spring_boot_practice.dto.CellPhoneResponse;
import com.example.spring_boot_practice.entity.CellPhone;
import com.example.spring_boot_practice.service.CellPhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/cellphone")
public class CellPhoneController {
    private  final CellPhoneService cellPhoneService;

    @PostMapping
    public CellPhoneResponse create(@RequestBody CellPhoneRequest request){
        return cellPhoneService.create(request);
    }

    @GetMapping("/{id}")
    public CellPhoneResponse getById(@PathVariable int id){
        return cellPhoneService.getById(id);
    }
}
