package whilePorDoWhile;
import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int n = sc.nextInt();
		int i = 0;
		int impar = 0;
		int sumimpar = 0;

		
		while (impar<n-1) {
			impar=i*2+1;			
			sumimpar = sumimpar + impar;
			i=i+1;
		}
		System.out.print(sumimpar);
		sc.close();
	}

}
