package whilePorDoWhile;
import java.util.Scanner;
public class SoloPares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Ingrese un número: ");
		int n = sc.nextInt();
		int i = 0;
		int par = 0;
		
		while(i<n) {
			par=i*2+2;			
			System.out.println(par);
			i=i+1;
		}
		sc.close();
	}
		
}
