package one;

import java.util.Scanner;

public class PractHW2P1Dr {
  
 public static void main(String[] args)
 {

		char operator = ' ';
		String response;
		do {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the input");
			int a = input.nextInt();
			int b = input.nextInt();
			
			String oS = input.next();
			int oI = oS.charAt(0);
			char o = (char) oI;
			
			int c = input.nextInt();
			int d = input.nextInt();
			
			PractHW2P1 f1 = new PractHW2P1();
			
			switch (o) { // Calculate the number base on the operator.
		case '-':
			f1.subtr(a, b, c, d);
			break;
			
			case '+':
			f1.add(a, b, c, d);
			break;
			
			case '*':
			f1.mult(a, b, c, d);
			break;
			
			case '/':
			f1.dvit(a, b, c, d);
			break;
			}
			System.out.println(f1);
			
			
			System.out.println();
			System.out.println(" Do you want to continue? y/n");
			response = input.next();
			System.out.println();
		} while (response.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
	}
}
