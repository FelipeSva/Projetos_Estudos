import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
	System.out.print("Bom");
	System.out.print(" Dia!");
	
	System.out.print("\nBom");
	System.out.print(" dia!");
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("\n\nDigite seu nome: ");
	String nome = entrada.nextLine();
	
	
	System.out.println("Digite seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.println("Digite sua idade: ");
	int idade = entrada.nextInt();
	
	System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
	
	entrada.close();
	
	}

}
