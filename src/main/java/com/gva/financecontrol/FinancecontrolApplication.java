package com.gva.financecontrol;

import com.gva.financecontrol.program.user.model.dto.UserRegisterDTO;
import com.gva.financecontrol.program.user.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FinancecontrolApplication implements CommandLineRunner{

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(FinancecontrolApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		UserRegisterDTO dto = new UserRegisterDTO(null, "gvianaraujo", "botafogoo", "Gabriel Viana de Araujo", "gvianaraujo@gmail.com");
		//Wallet
		userService.save(dto);
	}

}
