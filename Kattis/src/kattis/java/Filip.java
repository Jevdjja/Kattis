package kattis.java;

import java.util.Scanner;

public class Filip {

	public static void main(String[] args) {
		int num;
		int num2;
	    Scanner sc = new Scanner(System.in);
	    num= sc.nextInt();
	    num2 = sc.nextInt();
	    
	    String firstNum = Integer.toString(num);
	    String secondNum = Integer.toString(num2);
	    
	    String firstNumReverse = new StringBuilder(firstNum).reverse().toString();
	    String secondNumReverse = new StringBuilder(secondNum).reverse().toString();
	    
	    int firstNumBackToNormal = Integer.parseInt(firstNumReverse);
	    int secondNumBackToNormal = Integer.parseInt(secondNumReverse);
	    
	    if(firstNumBackToNormal> secondNumBackToNormal) {
	    	System.out.println(firstNumBackToNormal);
	    	
	    }else {
	    	System.out.println(secondNumBackToNormal);
	    }
	   

	}

}
