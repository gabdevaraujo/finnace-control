package com.gva.financecontrol.program.entryorigin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EntryOrigin {

    CASH(1, "Dinheiro"),
    CREDITCARD(2, "Cartão de Crédito");
    
    private Integer id;
    private String name;

}