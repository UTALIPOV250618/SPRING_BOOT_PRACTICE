package com.example.spring_boot_practice.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table()
@NoArgsConstructor
@ToString
@Data
public class CellPhone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cellPhoneId;
    private String model;
}
