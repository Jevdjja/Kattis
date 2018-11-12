package kattis.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mbPerMonth = sc.nextInt();
		int months = sc.nextInt();
		
		ArrayList<Integer> spentMBperMonth = new ArrayList<>();
		int totalMB=mbPerMonth;
		
		for(int i = 1; i <= months; i++) {
			   spentMBperMonth.add(sc.nextInt());
			}
		for(int i=0; i< spentMBperMonth.size(); i++ ) {
			
			totalMB = (totalMB + mbPerMonth) - spentMBperMonth.get(i);
			
		}
		System.out.println(totalMB);
	}

}
