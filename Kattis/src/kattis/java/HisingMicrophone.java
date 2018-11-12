package kattis.java;

import java.util.Scanner;

public class HisingMicrophone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hissing = sc.next();
		
	
		if(hissing.contains("ss")) {
		System.out.println("hiss");	
			
		}else {
			System.out.println("no hiss");
		}

	}

}
