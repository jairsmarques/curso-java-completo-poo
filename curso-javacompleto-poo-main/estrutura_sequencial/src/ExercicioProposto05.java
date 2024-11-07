/* Fazer um programa para ler o código de uma peça 1,
 *  o número de peças 1, o valor unitário de cada peça 1,
 *  o código de uma peça 2, o número de peças 2 
 *  e o valor unitário de cada peça 2. 
 *  Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoPecaUm, codigoPecaDois, quantidadePecaUm, quantidadePecaDois;
		double valorPecaUm, valorPecaDois, valorTotalPecaUm, valorTotalPecaDois, valorTotal;
		
		codigoPecaUm = sc.nextInt();
		quantidadePecaUm = sc.nextInt();
		valorPecaUm = sc.nextDouble();
		valorTotalPecaUm = quantidadePecaUm * valorPecaUm;
		
		codigoPecaDois = sc.nextInt();
		quantidadePecaDois = sc.nextInt();
		valorPecaDois = sc.nextDouble();
		valorTotalPecaDois = quantidadePecaDois * valorPecaDois;
		
		valorTotal = valorTotalPecaUm + valorTotalPecaDois;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
		
		sc.close();

	}

}
