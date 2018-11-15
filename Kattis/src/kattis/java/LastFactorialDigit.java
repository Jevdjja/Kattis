package kattis.java;

import java.util.Scanner;

public class LastFactorialDigit {

	public static void main(String[] args) {
		int nrOfSets=0;
		
		int number=0;
		Scanner sc = new Scanner(System.in);
		
		
		nrOfSets= sc.nextInt();
		for(int n=0; n< nrOfSets;n++) {
			number=sc.nextInt();
			
			int factorial = 1;
		for(int i=1; i<=number;i++) {
			factorial=i*factorial;
			
		}
		System.out.println(factorial%10);
	}

}
}