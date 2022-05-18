package com.gva.financecontrol.program.user.service;

import java.util.stream.Collectors;

import com.gva.financecontrol.program.user.model.User;
import com.gva.financecontrol.program.user.model.dto.UserRegisterDTO;
import com.gva.financecontrol.program.user.model.dto.UserResponseDto;
import com.gva.financecontrol.program.user.model.dto.UserlistDto;
import com.gva.financecontrol.program.user.repository.UserRepository;
import com.gva.financecontrol.program.wallet.model.dto.WalletDto;
import com.gva.financecontrol.program.wallet.repository.WalletRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private WalletRepository walletRepository;

    @Autowired
    private ModelMapper modelMapper;

    /* public UserlistDto getAllUsers(){
        UserlistDto userlistDto = new UserlistDto();
        userlistDto.setUsers(repository.findAll().stream().map(user -> converter(user)).collect(Collectors.toList()));
        return userlistDto;
    } */

    public UserResponseDto save(UserRegisterDTO dto){
        User user = modelMapper.map(dto, User.class);
        this.repository.save(user);
        return modelMapper.map(user, UserResponseDto.class);        
    }

    public WalletDto getWallet(Long userId){
        walletRepository.findByUserId(userId);
        return null;
    }
    
}