package whilePorDoWhile;
import java.util.Scanner;
public class SoloPares {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int n = sc.nextInt();
		int i = 0;
		int par = 0;

		do{
			System.out.println(par);
			par=i*2+2;			
			i=i+1;
		} while(i<n);
		sc.close();

	}

}
