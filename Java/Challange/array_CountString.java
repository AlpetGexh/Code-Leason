package Challage;
import java.util.Scanner;

public class array_CountString {
	//
	public static int contains(String[] vargu) {
		int count = 0;
		for(int i = 0; i < vargu.length; i++) {
			if(vargu[i].contains("test")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
	
		
		
//		String fjala = "Digjital";
//		if(fjala.contains("Digjital")) {
//			System.out.println("U perdor");
//		}
//		else {
//			System.out.println("nuk u perdor");
//		}
		Scanner s = new Scanner(System.in);
		String vargu[] = new String[2];
		
		for(int i = 0; i < vargu.length; i++) {
			System.out.print("Shruani fjali: ");
			vargu[i] = s.nextLine().toLowerCase();
		}   

		System.out.println(contains(vargu));

	}
}
