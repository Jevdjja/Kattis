package kattis.java;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class QualityAdjustedLifeYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nrOfPeriods = sc.nextInt();
		ArrayList<Double> qualityOfLife = new ArrayList<>();
		ArrayList<Double> nrOfYearInQuality = new ArrayList<>();
		double multiply=0;
		
		for(int i = 0; i< nrOfPeriods; i++) {
			qualityOfLife.add(sc.nextDouble());
			nrOfYearInQuality.add(sc.nextDouble());
			
			multiply = multiply + nrOfYearInQuality.get(i) * qualityOfLife.get(i);
			
			
		
	}
		DecimalFormat df = new DecimalFormat("##.###");
		System.out.println(df.format(multiply));	
  }
	
}
