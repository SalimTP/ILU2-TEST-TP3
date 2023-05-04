package ilu2;
public class Welcome {
	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("Hello, ");

		if(input == null || input.trim().equals("")) 
			return chaine.append("my friend").toString();
		
		
		if (input.toUpperCase().equals(input)) {
			chaine.append(input);
			return chaine.append(" !").toString().toUpperCase(); 
		}

		chaine.append(majusculePremiereLettre(input));
        return chaine.toString();
	}
	
	// Met en majuscule la première lettre du nom et la concatène avec "Hello".
	private static String majusculePremiereLettre(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}	
	
}