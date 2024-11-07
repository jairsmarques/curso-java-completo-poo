import java.util.Locale;

public class Concatenacao {

	public static void main(String[] args) {
		
		double x = 10.35784;
		
		System.out.println("RESULTADO = " + x + " METROS.");
		
		System.out.println();
		
		Locale.setDefault(Locale.US);
		System.out.printf("RESULTADO = %.2f metros%n", x); 

	}

}
