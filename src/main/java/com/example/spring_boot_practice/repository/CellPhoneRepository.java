package com.example.spring_boot_practice.repository;

import com.example.spring_boot_practice.entity.CellPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CellPhoneRepository extends JpaRepository<CellPhone,Integer> {
}
