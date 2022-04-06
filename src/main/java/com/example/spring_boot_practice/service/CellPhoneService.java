package com.example.spring_boot_practice.service;


import com.example.spring_boot_practice.dto.CellPhoneRequest;
import com.example.spring_boot_practice.dto.CellPhoneResponse;
import com.example.spring_boot_practice.entity.CellPhone;
import com.example.spring_boot_practice.mapper.CellPhoneEditMapper;
import com.example.spring_boot_practice.mapper.CellPhoneViewMapper;
import com.example.spring_boot_practice.repository.CellPhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CellPhoneService {

    private final CellPhoneRepository repository;
    private final CellPhoneEditMapper editMapper;
    private final CellPhoneViewMapper viewMapper;

    public CellPhoneResponse create(CellPhoneRequest request){
        CellPhone cellPhone  = editMapper.create(request);
        repository.save(cellPhone);
        return viewMapper.viewCellPhone(cellPhone);
    }
    public CellPhoneResponse getById(Integer id){
        CellPhone cellPhone = repository.findById(id).get();
        repository.save(cellPhone);
        return viewMapper.viewCellPhone(cellPhone);
    }
}
