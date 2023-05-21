package whilePorDoWhile;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int n = sc.nextInt();
		int i = 0;
		int fib = 0;
		int fib2 =0;
		int fib1 =0;
		
		do{
			
			fib= fib2 + fib1;
			System.out.println(fib);
			if(fib == 0) {
				fib2 = 0;
				fib1 = 1;
			}else {
				fib2 = fib1;
				fib1 = fib;
			}
			i=i+1;
		} while(i<n);
		
		sc.close();
		
	}

}
