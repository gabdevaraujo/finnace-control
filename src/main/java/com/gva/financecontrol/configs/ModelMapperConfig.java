package com.gva.financecontrol.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    ModelMapper modelMapper = new ModelMapper();

    //Cria e configurar um ModelMapper
    @Bean
    public ModelMapper modelMapper(){

        

        return modelMapper;
    }
    
}