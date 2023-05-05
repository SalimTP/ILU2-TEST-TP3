package ilu2;

public class Welcome {

    public static String welcome(String input) {
        StringBuilder chaine = new StringBuilder("Hello, ");

        if(input == null || input.trim().equals("")) 
            return chaine.append("my friend").toString();

        if(input.toUpperCase().equals(input)) {
            chaine.append(input);
            return chaine.append(" !").toString().toUpperCase();
        }
        if(input.contains(",")){
        	trieNomMajusculeMinuscule(input,chaine);
            return chaine.toString();
        	
        }   

        chaine.append(majusculePremiereLettre(input));
        return chaine.toString();
    }
    
    // Méthode permettant de mettre en majuscule la première lettre du nom et de la concaténer avec le mot "Hello"
    private static String majusculePremiereLettre(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }    
    
    private static void gestionNomsMinuscule(String[] noms, int nombreMinuscule, StringBuilder chaine) {
            int nbNoms = nombreMinuscule;
            if (nbNoms == 1) {
            	chaine.append(majusculePremiereLettre(noms[0].trim()));
            } else if (nbNoms == 2) {
            	chaine.append(majusculePremiereLettre(noms[0].trim())).append(" and ").append(majusculePremiereLettre(noms[1].trim()));
            } else {
                for(int i = 0; i < nbNoms - 1; i++) {
                	if((i+1)==(nbNoms - 1))
                		chaine.append(majusculePremiereLettre(noms[i].trim()));                		
                	else
                		chaine.append(majusculePremiereLettre(noms[i].trim())).append(", ");
                }
                chaine.append(" and ").append(majusculePremiereLettre(noms[nbNoms - 1].trim()));
            }
    }
    
    private static void gestionNomsMajuscule(String[] noms, int nombreMajuscule, StringBuilder chaine) {    
        int nbNoms = nombreMajuscule;
        if (nbNoms == 1) {
        	chaine.append(majusculePremiereLettre(noms[0].trim()));
        } else if (nbNoms == 2) {
        	chaine.append(majusculePremiereLettre(noms[0].trim())).append(" AND ").append(majusculePremiereLettre(noms[1].trim()));
        } else {
            for(int i = 0; i < nbNoms - 1; i++) {
            	if((i+1)==(nbNoms - 1))
            		chaine.append(majusculePremiereLettre(noms[i].trim()));                		
            	else
            		chaine.append(majusculePremiereLettre(noms[i].trim())).append(", ");
            }
            chaine.append(" AND ").append(majusculePremiereLettre(noms[nbNoms - 1].trim()));
        }
        chaine.append(" !");
    }
    
    private static void trieNomMajusculeMinuscule(String input, StringBuilder chaine) {
    	
    	String[] noms = input.split(",");
    	String[] nomsMinuscule = new String[noms.length];
    	String[] nomsMajuscule = new String[noms.length];
    	int nombreMinuscule=0, nombreMajuscule=0;    	
    	for(int i=0;i<noms.length;i++) {
    		if(noms[i].toUpperCase().equals(noms[i])) {   		
    			nomsMajuscule[nombreMajuscule]=noms[i];
    			nombreMajuscule++;
    		}
    		else {    			
    			nomsMinuscule[nombreMinuscule]=noms[i];
    			nombreMinuscule++;    			
    		}    			
    	}
    	gestionNomsMinuscule(nomsMinuscule,nombreMinuscule,chaine);
    	if(nombreMajuscule>0 && nomContientMajuscule(input)) {
    		chaine.append(". AND HELLO, ");
    		gestionNomsMajuscule(nomsMajuscule,nombreMajuscule,chaine);    		
    	}	
    }

    private static boolean nomContientMajuscule(String input) {
        if(input.contains(",")) {
            String[] noms = input.split(",");
            for (String nom : noms) {
            	if(nom.toUpperCase().equals(nom)) 
                    return true;              
            }
        } 
        return false;
    }
   
 
}