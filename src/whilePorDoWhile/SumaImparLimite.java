package whilePorDoWhile;

import java.util.Scanner;

public class SumaImparLimite {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese el límite mínimo: ");
		int limmin = sc.nextInt();
		System.out.println("Ingrese el límite máximo: ");
		int limmax = sc.nextInt();
		int sumimpar = 0;
		
		while (limmin <= limmax) {
			if (limmin%2 != 0) {		
			sumimpar = sumimpar + limmin;
			}
			limmin=limmin+1;
		}
		System.out.print(sumimpar);
		sc.close();
	}

}
