import java.util.Locale;

void main() {
	int y =32;
	double x = 10.35784;
	System.out.println("Bom dia!");
	IO.println("Bom dia!");
	
	System.out.println(y);
	IO.println(y);
	
	System.out.printf("%.2f%n", x);
	IO.println("%.2f".formatted(x));
	
	Locale.setDefault(Locale.US);
	System.out.printf("%.2f%n", x);
	IO.println("%.2f".formatted(x));
	
	System.out.println("RESULTADO = " + x + " METROS");
	System.out.printf("Resultado = %.2f metros%n", x);
	
	String nome = "Maria";
	int idade = 31;
	double renda = 4000.0;
	System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
}