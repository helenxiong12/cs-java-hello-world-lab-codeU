package com.flatironschool.javacs;

public class HelloWorld {
    public static /*Double*/String getVersion() {    
    	/*String version = System.getProperty("java.version");
    	int pos = version.indexOf('.');
    	pos = version.indexOf('.', pos+1);
    	return Double.parseDouble(version.substring(0, pos);//);*/
    	return System.getProperty("java.version");
    }

    public static void main(String[] args) {
		System.out.println(getVersion());
    }
}
