package com.github.umartin.rinjava;

//import org.rosuda.REngine.REngine;

import org.rosuda.JRI.Rengine;

//import org.rosuda.

public class Main {


	public static void main(String[] args) {
//		System.se
//		System.setProperty("java.library.path", System.getProperty("java.library.path") + ":/usr/lib64/R/library/rJava/jri");
		System.out.println("java.library.path: " + System.getProperty("java.library.path"));
		System.out.println("R_HOME: " + System.getenv("R_HOME"));
		System.out.println("LD_LIBRARY_PATH: " + System.getenv("LD_LIBRARY_PATH"));

		System.load("/usr/lib64/R/library/rJava/jri/libjri.so");

				///usr/lib64/R/lib


		Rengine rengine = new Rengine(new String[]{"--no-save"} , false, null);

		rengine.eval("rVector=c(1,2,3,4,5)");
		rengine.eval("meanVal=mean(rVector)");
		double result = rengine.eval("meanVal").asDouble();

		rengine.end();

		System.out.println("result: " + result);
	}
}
