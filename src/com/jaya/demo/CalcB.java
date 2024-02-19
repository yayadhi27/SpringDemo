package com.jaya.demo;

public class CalcB implements Calc{
	
	@Override
	public void add(int x,int y) {
		
		System.out.println("calcB ="+(x+y));
	}
	
	@Override
	public String toString() {
		return "CalcB []";
				}
	
	

}
