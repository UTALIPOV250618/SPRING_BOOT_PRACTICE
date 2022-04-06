package com.example.spring_boot_practice.mapper;

import com.example.spring_boot_practice.dto.CellPhoneRequest;
import com.example.spring_boot_practice.entity.CellPhone;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CellPhoneEditMapper {

    public CellPhone create(CellPhoneRequest request){

        if (request == null) {
            return null;
        }
        CellPhone cellPhone = new CellPhone();
        cellPhone.setModel(request.getModel());
        return cellPhone;
    }
    public CellPhone update(CellPhone cellPhone,CellPhoneRequest request){
        cellPhone.setModel(request.getModel());
        return cellPhone;
    }
}
