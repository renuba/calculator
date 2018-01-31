package com.calculator.entity;

import java.io.Serializable;

public class UserInputVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int firstInput;
	private int secondInput;
	
	
	
	public UserInputVO(int firstInput, int secondInput) {
		super();
		this.firstInput = firstInput;
		this.secondInput = secondInput;
	}
	
	
	
	public UserInputVO() {
	}



	public int getFirstInput() {
		return firstInput;
	}
	public void setFirstInput(int firstInput) {
		this.firstInput = firstInput;
	}
	public int getSecondInput() {
		return secondInput;
	}
	public void setSecondInput(int secondInput) {
		this.secondInput = secondInput;
	}

	@Override
	public String toString() {
		return "UserInputVO [firstInput=" + firstInput + ", secondInput=" + secondInput + "]";
	}
	
	
}