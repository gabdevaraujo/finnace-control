package com.gva.financecontrol.program.wallet.model.dto;

import java.math.BigDecimal;
import java.util.List;

import com.gva.financecontrol.program.entry.model.dto.EntryDto;
import com.gva.financecontrol.program.user.model.dto.UserResponseDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WalletDto {

    private Long id;
    private String name;
    private BigDecimal balance;
    private UserResponseDto userDto;
    private List<EntryDto> entries;

}
