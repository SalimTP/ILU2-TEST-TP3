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
        
        String[] noms2 = gestionPlusieursNoms(input);
        if(noms2.length!=0) {
            for (int i = 0;i<noms2.length-1;i++){
                chaine.append(noms2[i]+", ");
            }
            chaine.append(majusculePremiereLettre(noms2[noms2.length-1]));
            return chaine.toString();
        }
        
        chaine.append(majusculePremiereLettre(input));
        return chaine.toString();
    }
    
    // Méthode permettant de mettre en majuscule la première lettre du nom et de la concaténer avec le mot "Hello"
    private static String majusculePremiereLettre(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }    
    
    // Méthode permettant la gestion de plusieurs noms en les séparant et en mettant leur première lettre en majuscule
    private static String[] gestionPlusieursNoms(String input) {
        if(input.contains(",")) {
            String[] noms = input.split(",");
            String[] nomsMajuscule = new String[noms.length];
            for(int i=0; i<noms.length; i++) {
                nomsMajuscule[i] = majusculePremiereLettre(noms[i].trim());
            }
            return nomsMajuscule;
        }
        return new String[0];
    }  
}