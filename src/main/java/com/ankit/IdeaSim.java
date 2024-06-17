package com.ankit;

public class IdeaSim implements Number {

	private int num;
	
	
	public IdeaSim(int num) {
		super();
		this.num = num;
	}


	public void display() {
		System.out.println("Calling from idea sim no :" + num);
	}
}
