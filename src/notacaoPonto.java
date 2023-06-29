
public class notacaoPonto {
	 public static void main(String[] args) {
		
		 String s = " Ola mundo";
		 s = s.replace("Ola", "Tchau");
		 s = s.concat(" Eu to indo de base");
		 s = s.toUpperCase();
		  
		 System.out.println(s);
		 
		 String x = "Felipe sera dev";
		 x = x.concat(" ainda esse ano")
				 .replace("Felipe","Adalba")
				 .toUpperCase();
		 System.out.println(x);
	}
}
