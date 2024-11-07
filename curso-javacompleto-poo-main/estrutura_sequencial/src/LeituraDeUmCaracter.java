import java.util.Scanner;

public class LeituraDeUmCaracter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0);
		
		System.out.println("Voce digitou: ");
		System.out.println(x);
		
		sc.close();

	}

}
