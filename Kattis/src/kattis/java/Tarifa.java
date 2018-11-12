package kattis.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mbPerMonth = sc.nextInt();
		int months = sc.nextInt();
		
		ArrayList<Integer> spentMBperMonth = new ArrayList<>();
		int totalMB=0;
		
		for(int i=0; i< spentMBperMonth.size(); i++ ) {
			
			totalMB = (totalMB + mbPerMonth) - spentMBperMonth.get(i);
			System.out.println(totalMB);
		}
 
	}

}
