package kattis.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarifa {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int mbPerMonth = sc.nextInt();
	int months = sc.nextInt();
	
	ArrayList<Integer> usedMB = new ArrayList<>();
	int totalMB = mbPerMonth;
	for(int i = 0; i< months; i++) {
		usedMB.add(sc.nextInt());
		
	}
	for(int i=0; i< usedMB.size(); i++) {
		totalMB = (totalMB+ mbPerMonth)-usedMB.get(i);
		
	}
     System.out.println(totalMB);
	}

}
