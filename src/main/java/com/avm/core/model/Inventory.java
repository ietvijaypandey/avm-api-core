package com.avm.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String deliveryBoyId;
    private LocalDate date;
    private String productType;
    private String inventoryFlow;
    private int inventoryCount;
    private boolean signOffByManager;
    private boolean isSignOffByDeliveryBoy;

    private String active;
    private String createdBy;
    private LocalDate createdDate;
    private String modifyBy;
    private LocalDate modifyDate;
}
