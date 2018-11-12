package kattis.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Oditties {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nrOfTestCases= sc.nextInt();
		
		ArrayList<Integer> nrOddOrNot = new ArrayList<>();
		int nr;
		for(int i = 0; i< nrOfTestCases; i++) {
			nrOddOrNot.add(sc.nextInt());
			nr= nrOddOrNot.get(i);
			
			
	 if(nr % 2 == 0) {
		 System.out.println(nr + " is even");
		 
	 }else {
		 System.out.println(nr + " is odd");
	 }
  
	}
  }
}
