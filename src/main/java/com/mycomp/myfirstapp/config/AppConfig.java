package com.mycomp.myfirstapp.config;

import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

@Configuration
public class AppConfig {

	@Bean
	Random getRandom() {
		return new Random();
	}

	@Bean
	Gson getGson() {
		return new Gson();
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
