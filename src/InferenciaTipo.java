
public class InferenciaTipo {
	public static void main(String[] args) {
		
		double a = 4.5; //determinei um tipo e um valor.
		System.out.println(a);
		
		var b = 4.5; // não determinei o tipo, mas usando o var,
		//pelo valor dado, se é atribuido o tipo da variavel.
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variavel foi inicializada
		System.out.println(d); // usada! 
		
	}
}
