import java.util.Scanner;


public class aula7 {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
		float nota = 0;
		final int MEDIA = 6;
		String nome = "", res ="";
		
		System.out.print("ALUNO:");
		nome = tec.nextLine();
		System.out.print("1ª nota:");
		n1 = tec.nextInt();
		System.out.print("2ª nota:");
		n2 = tec.nextInt();
		System.out.print("3ª nota:");
		n3 = tec.nextInt();
		System.out.print("4ª nota:");
		n4 = tec.nextInt();
		soma = n1 + n2 + n3 + n4;
		nota = soma / 4;
		
		if(nota >= MEDIA) {
			res = "Aprovado";
		}
		else if(nota < 50) {
			res = "Reprovado";
		}
		else {
			res = "Recuperação";
		}
		
		System.out.printf(" Aluno: %s\n Nota: %.2f\n Resultado: %s", nome, nota, res);
		
	}
}
