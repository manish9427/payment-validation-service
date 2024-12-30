package com.mycomp.myfirstapp.service.impl;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.mycomp.myfirstapp.dto.AddReqDTO;
import com.mycomp.myfirstapp.dto.AddResDTO;
import com.mycomp.myfirstapp.service.interfaces.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	
	private Random random;
	
	private Gson gson;
	
	public CalculatorServiceImpl(Random random, 
			Gson gson) {
		this.random = random;
		this.gson = gson;
	}
	
	// write slf4j logger for this class using logback
	private static final Logger logger = LoggerFactory.getLogger(CalculatorServiceImpl.class);
	
	@Override
	public AddResDTO addNumbers(AddReqDTO addReq) {
		
		logger.info("Received request to add numbers addReq: {}", addReq);
		
		int sum = addReq.getNum1() + addReq.getNum2();
		
		
		int randInt = random.nextInt(100);
		
		logger.info("Random number: {}", randInt);
		
		
		
		String json = gson.toJson(addReq);
		
		logger.info("JSON: {}", json);
		
		
		logger.info("Calculated sum: {}", sum);
		AddResDTO res = new AddResDTO();
		res.setSum(sum);
		return res;
	}

}
