
import java.util.Scanner;
public class Swap3Values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Alabala portokala
		Scanner input = new Scanner(System.in);
		
		int a1;
		int a2;
		int a3;
		int a4;
		
		System.out.print("Enter Value a1: ");
		a1 = input.nextInt();
		
		System.out.print("Enter Value a2: ");
		a2 = input.nextInt();
		
		System.out.print("Enter Value a3: ");
		a3 = input.nextInt();
		
		a4 = a1;
		a1 = a2;
		a2 = a3;
		a3 = a4;
		
		
		System.out.println("a1 Swap Value b1: " + a1);
		System.out.println("b1 Swap Value c1: " + a2);
		System.out.println("a3 Swap Value a1: " + a3);
		
		input.close();		
		
	}

}
