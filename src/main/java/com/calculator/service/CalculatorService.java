package com.calculator.service;

import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;
import org.springframework.stereotype.Service;
import org.tempuri.Calculator;

import com.calculator.entity.UserInputVO;

@Service
public class CalculatorService {
	
	public int add(UserInputVO userInputVO) throws RemoteException, ServiceException {		
		return new Calculator().getCalculatorSoap().add(userInputVO.getFirstInput(), userInputVO.getSecondInput());
	
	}
	public int subs(UserInputVO userInputVO) throws RemoteException, ServiceException {		
		return new Calculator().getCalculatorSoap().subtract(userInputVO.getFirstInput(), userInputVO.getSecondInput());
	}
	
	public int multiply(UserInputVO userInputVO) throws RemoteException, ServiceException {		
		return new Calculator().getCalculatorSoap().multiply(userInputVO.getFirstInput(), userInputVO.getSecondInput());
	
	}
	public int divide(UserInputVO userInputVO) {
		return new Calculator().getCalculatorSoap().divide(userInputVO.getFirstInput(), userInputVO.getSecondInput());
	}
}
