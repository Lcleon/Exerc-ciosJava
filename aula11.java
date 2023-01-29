import java.util.Scanner;

public class aula11 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		int x = 0;
		int cont = 0;
		
		System.out.print("Quantas repetições? ");
		x = tec.nextInt();
		
		do {
			System.out.printf("%dª repetições...\n", cont + 1);
			cont++;
		}while(cont < x);
		
	}
}
