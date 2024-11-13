/*
 * Fazer um programa que leia o número de um funcionário, 
 * seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário.
 * A seguir, mostre o número e o salário do funcionário, 
 * com duas casasdecimais.
 */

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero, horasTrabalhadas;
		double salario, valorHora;
		
		numero = sc.nextInt();
		horasTrabalhadas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
