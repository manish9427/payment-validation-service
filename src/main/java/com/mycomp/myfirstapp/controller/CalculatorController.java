package com.mycomp.myfirstapp.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycomp.myfirstapp.dto.AddReqDTO;
import com.mycomp.myfirstapp.dto.AddResDTO;
import com.mycomp.myfirstapp.pojo.AddReq;
import com.mycomp.myfirstapp.pojo.AddRes;
import com.mycomp.myfirstapp.service.interfaces.CalculatorService;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CalculatorController {


	private CalculatorService  calculatorService;
	
	private ApplicationContext applicationContext;
	
	//read key mytestkey from properties file & assign it to myTestKey variable
	@Value("${mytestkey}")
	private String myTestKey;
	
	private ModelMapper modelMapper;
	
	public CalculatorController(ApplicationContext applicationContext,CalculatorService calculatorService,ModelMapper modelMapper) {
        this.applicationContext = applicationContext;
        this.calculatorService = calculatorService;
        this.modelMapper = modelMapper;
        log.info("CalculatorController instance created, applicationContext: {}", 
        		applicationContext);
	}
	
	@PostConstruct
	public void init() {
		log.info("CalculatorController bean created, myTestKey: {}", myTestKey);
	}
	
	@PostMapping("/add")
	public AddRes addNumbers(@RequestBody AddReq addReq) {
		log.info("Received request addReq: {}", addReq);
		
		AddReqDTO reqDTO = modelMapper.map(addReq, AddReqDTO.class);
		
		log.info("Convert to AddReqDTO: {}",reqDTO);
		
		AddResDTO sum = calculatorService.addNumbers(reqDTO);
		
		AddRes res = modelMapper.map(sum, AddRes.class);
		
		log.info("Received from service, sum: {}", res);
		return res;
	}
}
