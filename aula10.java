import java.util.Scanner;

public class aula10 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int max = 0;
		int cont = 0;
		
		System.out.print("Quantas repetições? ");
		max = tec.nextInt();
		
		while(cont < max) {
			System.out.printf("%dª repetição...\n", cont + 1);
			cont++;
		}
		
	}
}
