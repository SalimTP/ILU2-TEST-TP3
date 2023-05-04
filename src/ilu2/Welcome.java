package ilu2;


public class Welcome {

	public static String welcome(String input) {
		StringBuilder chaine = new StringBuilder("Hello, ");
		
		if(input == null || input.trim().equals("")) {
			return chaine.append("my friend").toString();
		}
		
		if(input.toUpperCase().equals(input)) {
			chaine.append(input);
			return chaine.append(" !").toString().toUpperCase();
		}
		
		String[] noms2 = gestionDeuxNoms(input);
		if(noms2.length!=0) {
			return chaine.append(noms2[0] + ", " + noms2[1]).toString();
		}
		
		chaine.append(majusculePremiereLettre(input));
        return chaine.toString();
	}
	
	// Méthode permettant de mettre en majuscule la première lettre du nom et de la concaténer avec le mot "Hello"
	private static String majusculePremiereLettre(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1);
	}	
	
	// Méthode permettant la gestion de deux noms en les séparant et en mettant leur première lettre en majuscule
	private static String[] gestionDeuxNoms(String input) {
		if(input.contains(",")) {
			String[] noms = input.split(",");
			String prenom1 = noms[0];
			String prenom2 = noms[1];
			String prenomMajuscule1 = majusculePremiereLettre(noms[0]);
			String prenomMajuscule2 = majusculePremiereLettre(noms[1]);
			String[] noms2 = {prenomMajuscule1, prenomMajuscule2};
			return noms2;	
		}
		return new String[0];		
	}
	
}