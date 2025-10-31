/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro 
 * pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			int primeiroNumero = sc.nextInt();
			int segundoNumero = sc.nextInt();
			if (segundoNumero == 0) {
				System.out.println("divisão impossível");
			} else {
				System.out.println((double) primeiroNumero / segundoNumero);
			}
		}

		sc.close();

	}

}
