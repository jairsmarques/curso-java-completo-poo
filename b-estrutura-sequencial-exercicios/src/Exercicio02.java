/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área 
 * deste círculo com quatro casas decimais.
 * 
 * Formula d área = pi * raio * raio.
 * Considere o valor de pi = 3.14159.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio, pi, area;
		raio = sc.nextDouble();
		pi = 3.14159;

		area = pi * raio * raio;

		System.out.printf("A=%.4f%n", area);

		sc.close();
	}

}
