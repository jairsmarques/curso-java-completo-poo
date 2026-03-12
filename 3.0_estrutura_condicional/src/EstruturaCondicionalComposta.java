import java.util.Scanner;

public class EstruturaCondicionalComposta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas?");
		int hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else {
			System.out.println("Boa tarde!");
		}

		sc.close();

	}

}
