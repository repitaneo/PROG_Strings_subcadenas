package strings;


public class Start {

	public static void main(String[] args) {


		String frase = "soyspatata--";
		String miniFrase = "patata";
		

		
		boolean coincide = false;
		boolean laEncontre = false;
		
		int i = 0;
		int j = 0;
		
		// mientras que no lo encuentre y tenga cosas para mirar
		while(i<frase.length()&&(!laEncontre)) {
			
			//Si coinciden...
			if(frase.charAt(i)==miniFrase.charAt(j)) {
				
				// subo una bandera y avanzo los dos
				coincide = true;
				i++;
				j++;
			}
			// si coincidian pero ya no coinciden
			else if(coincide){
				// reseteo la visión en la minifrase
				j=0;
				// y bajo la bandera
				coincide = false;
			}
			// si no coinciden ni eataban coincidiendo
			// avanzo la larga
			else i++;
			
			
			if((j==miniFrase.length())&&coincide) {
				
				laEncontre = true;
			}

		}
		
		
		
		
		
		if(laEncontre) {
			
			System.out.println("Estaba en "+(i-miniFrase.length()));
		}
		else System.out.println("No estaba ");
		

	}

}
