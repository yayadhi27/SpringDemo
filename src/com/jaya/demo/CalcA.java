package com.jaya.demo;


public class CalcA implements Calc{

	@Override
	public void add(int x, int y) {
		System.out.println("CalcA ="+(x+y));
	}
	
	@Override
	public String toString() {
		return "CalcA []";
	}
}
