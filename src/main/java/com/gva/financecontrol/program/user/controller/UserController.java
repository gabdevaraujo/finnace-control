package com.gva.financecontrol.program.user.controller;

import com.gva.financecontrol.program.user.model.dto.UserRegisterDTO;
import com.gva.financecontrol.program.user.model.dto.UserResponseDto;
import com.gva.financecontrol.program.user.model.dto.UserlistDto;
import com.gva.financecontrol.program.user.service.UserService;
import com.gva.financecontrol.program.wallet.model.Wallet;
import com.gva.financecontrol.program.wallet.model.dto.WalletDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService service;

    //TODO: Adjustments to make this controller acessible only to admins
    /* @GetMapping
    public ResponseEntity<UserlistDto> getAll(){
        UserlistDto dto = service.getAllUsers();
        return ResponseEntity.ok(dto);
    } */

    @PostMapping
    public ResponseEntity<UserResponseDto> register(@RequestBody UserRegisterDTO dto){
        UserResponseDto userDto = service.save(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @GetMapping("/{userId}/wallets")
    public ResponseEntity<WalletDto> getUserWallet(@PathVariable Long userId){
        
        return null;
    }
    
}