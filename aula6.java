import java.util.Scanner;

public class aula6 {

		public static void main(String[] args) {
		
			Scanner tec = new Scanner(System.in);
			
			String nome = "";
			float n1 = 0;
			float n2 = 0;
			float med = 0;
			
			System.out.println("Nome do aluno: ");
			nome = tec.nextLine();
			System.out.println("Digite a primeira do aluno: ");                
			n1 = tec.nextFloat();
			System.out.println("Digite a segunda nota: ");
			n2 = tec.nextFloat();
			med = (n1 + n2) / 2;
			
			System.out.printf("Aluno: %s\n1ª nota: %.2f\n2ª nota: %.2f\n", nome, n1, n2);
			
			if(med < 5){
				System.out.printf("Reprovado -> Média %.2f", med);
			}
			else if(med >= 5 && med < 7 ){
				System.out.printf("Recuperação _> Média: %.2f", med);
			}else {
				System.out.printf("Aprovado -> Média: %.2f", med);
			}
		}
}			
			
		

			
	
