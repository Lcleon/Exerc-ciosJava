import java.util.Scanner;

public class Aula5 {
	
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		int x, y, z = 0;
		
		System.out.print("1° numero: ");
		x = tec.nextInt();
		System.out.print("2° numero: ");
		y = tec.nextInt();
		z = x + y;
		System.out.printf("X = %d\nY = %d\nZ = %d + %d\nZ = %d", x, y, x, y, z);
		
		
	}
}
