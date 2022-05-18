package com.gva.financecontrol.program.user.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto {

    private Long id;

    private String username;

    private String fullName;

    private String email;

    //TODO: Create WalletDto and create a method to populate it
    //private WalletDto wallet;


}
