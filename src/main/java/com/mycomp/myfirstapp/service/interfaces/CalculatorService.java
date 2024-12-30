package com.mycomp.myfirstapp.service.interfaces;

import com.mycomp.myfirstapp.dto.AddReqDTO;
import com.mycomp.myfirstapp.dto.AddResDTO;

public interface CalculatorService {
	public AddResDTO addNumbers(AddReqDTO addReq);
}
