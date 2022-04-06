package com.example.spring_boot_practice.mapper;

import com.example.spring_boot_practice.dto.CellPhoneResponse;
import com.example.spring_boot_practice.entity.CellPhone;
import com.example.spring_boot_practice.entity.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CellPhoneViewMapper {

    public CellPhoneResponse viewCellPhone(CellPhone cellPhone){

        if (cellPhone == null) {
            return null;
        }
        CellPhoneResponse cellPhoneResponse = new CellPhoneResponse();

        if (cellPhone.getCellPhoneId()!= null) {
            cellPhoneResponse.setCellphone_id(String.valueOf(cellPhone.getCellPhoneId()));
        }
        cellPhoneResponse.setModel(cellPhone.getModel());
        return cellPhoneResponse;
    }

    public List<CellPhoneResponse> view(List<CellPhone> cellPhones){

        List<CellPhoneResponse> phoneResponses = new ArrayList<>();
        for (CellPhone cell:cellPhones
             ) {
            phoneResponses.add(viewCellPhone(cell));
        }
        return phoneResponses;
    }

}
