import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		int y = 32;
		
		System.out.println(y);
		System.out.print("Bom dia! ");
		System.out.println("Olá Mundo!");
		
		double x = 10.34567;
		System.out.println(x);
		System.out.printf("%.2f", x);
		System.out.println();
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		String nome = "Maria";
		int idade = 31;
		double salario = 4000.0;
		System.out.println();
		
		System.out.printf("%s, tem %d anos e ganha R$ %.2f reais %n", nome, idade, salario);

	}

}
