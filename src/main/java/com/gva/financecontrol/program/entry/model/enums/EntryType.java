package com.gva.financecontrol.program.entry.model.enums;

import lombok.Getter;

public enum EntryType {

    INPUT(1, "Entrada"),
    OUTPUT(2, "Saída");

    @Getter private Integer id;
    @Getter private String description;

    EntryType(Integer id, String description){
        this.id = id;
        this.description = description;
    }
    
}