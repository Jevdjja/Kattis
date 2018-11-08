package kattis.java;

import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String[]values=name.split("-");
		for(int i=0;i<values.length;i++)
		{
		System.out.print(values[i].charAt(0));
		}
		System.out.println();

	}

}
