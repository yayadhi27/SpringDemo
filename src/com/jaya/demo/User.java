package com.jaya.demo;

public class User {
	
	Calc calc;
	
	public User() {
		super();
	}
	
	public User(Calc c) {
		this.calc = c;
	}
	public void invokeAdd(int x,int y) {
		
		calc.add(x,y);
	}
 
	
	public Calc getCalc() {
		return calc;
	}
 
	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	

	
}

