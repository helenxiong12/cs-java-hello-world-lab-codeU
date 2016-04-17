package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
    	//System.out.println(Double.parseDouble(System.getProperty("java.version")));    
    	return Double.parseDouble(System.getProperty("java.specification.version"));    
    }

    public static void main(String[] args) {
		System.out.println(getVersion().toString());
    }
}
