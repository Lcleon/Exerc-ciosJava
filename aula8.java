import java.util.Scanner;

public class aula8 {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);

		int cont = 0;
		int x = 0;

		System.out.print("Tabuada: ");
		x = tec.nextInt();

		for (cont = 0; cont < 11; cont++) {
			System.out.printf("%d X %d = %d\n", x , cont, x * cont);
		}

	}
}
