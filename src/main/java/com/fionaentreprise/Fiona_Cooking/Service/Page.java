package com.fionaentreprise.Fiona_Cooking.Service;

public class Page {


	public static String retour_Page(String menu ) {
     
        String resultat;
        
	        switch (menu) {
	            case  "Poulet braisé":
	            	resultat= "pages/menu1";
	            	 break;     
	            case  "côte de Porc":
	            	resultat= "pages/menu2";
	            	 break; 
	            	 
	            case  "Travers de Porc(Cotis braisé)":
	            	resultat= "pages/menu3";
	            	 break; 
	            case  "côte de Mouton braisé":
	            	resultat= "pages/menu4";
	            	 break;
	            case  "Côte de boeuf braisé":
	            	resultat= "pages/menu5";
	            	 break;
	            case  "Poisson braisé":
	            	resultat= "pages/menu6";
	            	 break;
	            case  "Gambas braisé":
	            	resultat= "pages/menu7";
	            	 break;
	            case  "Saucisse de Toulouse":
	            	resultat= "pages/menu8";
	            	 break;
	            default: resultat = "Aucun";
                break;
                  }
	         return resultat;

	}
    } 