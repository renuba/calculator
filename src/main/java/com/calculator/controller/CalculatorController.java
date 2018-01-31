package com.calculator.controller;


import com.calculator.entity.ResponseVO;
import com.calculator.entity.UserInputVO;
import com.calculator.service.CalculatorService;

import java.rmi.RemoteException;

import javax.validation.Valid;
import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CalculatorController {

	@Autowired
	CalculatorService calculatorService;
	
	   RestTemplate restTemplate;
	
	@RequestMapping(method = RequestMethod.POST, path = "/calculator/add", produces = "application/json", consumes = "application/json")
	public ResponseVO add(@RequestBody UserInputVO userInputVO) throws RemoteException, ServiceException{

		ResponseVO responseVO = new ResponseVO();
		int result =calculatorService.add(userInputVO);

			//restTemplate.postForEntity(url, request, responseType);
			responseVO.setResult(result);
			responseVO.setMessage("Addition of "+userInputVO.getFirstInput()+" and "+userInputVO.getSecondInput()+" is "+result);
		
		return responseVO;
	}
	@RequestMapping(method = RequestMethod.POST, path = "/calculator/subs", produces = "application/json", consumes = "application/json")
	public ResponseVO subs(@RequestBody UserInputVO userInputVO) throws RemoteException, ServiceException{

		ResponseVO responseVO = new ResponseVO();
		int result =calculatorService.subs(userInputVO);

			//restTemplate.postForEntity(url, request, responseType);
			responseVO.setResult(result);
			responseVO.setMessage("Substraction of "+userInputVO.getFirstInput()+" and "+userInputVO.getSecondInput()+" is "+result);
		
		return responseVO;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/calculator/multiply", produces = "application/json", consumes = "application/json")
	public ResponseVO multiply(@RequestBody UserInputVO userInputVO) throws RemoteException, ServiceException{

		ResponseVO responseVO = new ResponseVO();
		int result =calculatorService.multiply(userInputVO);

			//restTemplate.postForEntity(url, request, responseType);
			responseVO.setResult(result);
			responseVO.setMessage("Multiply of "+userInputVO.getFirstInput()+" and "+userInputVO.getSecondInput()+" is "+result);
		
		return responseVO;
	}
}
