package Challage;

import java.util.Scanner;

public class convert_koha {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.print("Shruani numrin ne sekonda: ");
		
		int input = s.nextInt();
		int minuta = input /60;
		int sekonda = input %60;
		
		System.out.println("Koha p�r " + input + "s " + " �sht� " + minuta + " minuta dhe " + sekonda + "sekonda " );
	}
}
