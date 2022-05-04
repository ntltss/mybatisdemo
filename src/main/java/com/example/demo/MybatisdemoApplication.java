package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MybatisdemoApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(MybatisdemoApplication.class, args);
	}

	private final CityMapper cityMapper;

	public MybatisdemoApplication(CityMapper cityMapper) {
		this.cityMapper = cityMapper;
	}

	@Override
	public void run(String... args) {
		System.out.println(cityMapper.findById(1));
	}

}
