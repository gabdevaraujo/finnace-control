package com.gva.financecontrol.program.entry.model.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EntryDto {

    private Long id;
    private String description;
    private String entryType;
    private String origin;
    private LocalDate entryDate;
    
}