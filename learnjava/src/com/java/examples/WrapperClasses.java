package com.java.examples;

public class WrapperClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = Integer.valueOf("1010",2);
		Double d1 = Double.valueOf("3.142");
		
		int i2 = Integer.parseInt("22");
		
		int c = i1.intValue();
		double d = d1.doubleValue();
		System.out.println(c);
		System.out.println(d);
		System.out.println(i2);

	}

}
