package com.wyf.maven;

public class App {
	public int addition (int a ,int b) {
		return a+b;
	}
    public static void main( String[] args ) {
    	App add = new App();
    	System.out.print(add.addition(3,4));
    }
}