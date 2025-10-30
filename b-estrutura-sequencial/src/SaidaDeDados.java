import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {

		// sem quebra de linha
		System.out.print("Olá mundo! ");

		// com quebra de linha
		System.out.println("Bom dia!");
		System.out.println("Curso de Programação Java");

		System.out.println("---------------------");
		int y = 32;
		System.out.println(y);

		System.out.println("---------------------");
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		System.out.println("---------------------");
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.printf("RESULTADO = %.4f METROS%n", x);

		System.out.println("---------------------");
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
