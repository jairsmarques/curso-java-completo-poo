/*
 * Fazer um programa que l~e números inteiros até que um zero seja lido.
 * Ao final mostra a soma dos números lidos.
 */
import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x  =sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();	
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
