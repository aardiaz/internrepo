package corejava;

import javax.swing.JOptionPane;

public class Hello {
	/*
	 * -------------- Access modifiers -----------
	 *  a> public     : access everywhere
	 *  b> protected  : access in class,same package and child class in different package
	 *  c> default(package private) : access in class and same package.
	 *  d> private  : access in class only.
	 */
	
	//main+ctrl+space
	 public   static void   main(String... yyyy) {
		
		System.out.print("Good Afternoon : ");
		JOptionPane.showMessageDialog(null, "Hello");
	}
    
	/*  Q> What is the function of main
	 *   a> compile only
	 *   b> run only 
	 *   c> both 
	 */
}


