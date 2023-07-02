
public class ConversaoTipoPrimitivoNumerico {
		public static void main(String[] args) {
			
			double a = 1;    //conversão implicita
			System.out.println(a);
			
			
			float b = (float) 1.12345678; //conversão Explicita
			System.out.println(b);
			
			int c = 20;
			byte d = (byte) c; // explicita (CAST)
			System.out.println(d);
			
			
		}

}
