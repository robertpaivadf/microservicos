package com.robert.hruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class HrUserApplication implements CommandLineRunner{

	//USANDO O BCRYPT PARA CRIPTOGRAFAR SENHAS
	@Autowired
	private BCryptPasswordEncoder passwordEncoder; //não está instanciado por padrão no Sprig, nesse caso precisa gerar um BEAN na classe AppConfig
	
	
	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("BCRYPT (123456) = " + passwordEncoder.encode("123456"));		
	}

}
