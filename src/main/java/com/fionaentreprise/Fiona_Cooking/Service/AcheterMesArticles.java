package com.fionaentreprise.Fiona_Cooking.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fionaentreprise.Fiona_Cooking.data.Article;
import com.fionaentreprise.Fiona_Cooking.data.Utilisateur;

@Service
public class AcheterMesArticles {
              
 
public String  factures(Utilisateur utilisateur,Article article) {
    	 String FactureTotal="";
    	 
    	 String Quartier = utilisateur.getQuartier();
    	 String ville = utilisateur.getVille();	
    	 
    	      String nom = utilisateur.getNom();
    		  String prenom = utilisateur.getPrenom();
    		
    		  String tel = utilisateur.getTel();
    		
    		  String login = utilisateur.getLogin();
    		
    		  String adresse = utilisateur.getAdresse();
    	   
    		  String Monarticle = article.getArticle();
    		  
              String accompagnement= article.getAccompagnement();

    		   int prixTotal = article.getPrixTotal();
     	 
    	 
    FactureTotal = "Merci "+prenom+" d'avoir saisie votre commande\n veuillez trouvez ci dessous votre facture\n\nPlat choisie : "+Monarticle+"\nAccompagnement : "
    +accompagnement+"\nNom : "+nom+"\nprenom : "+prenom+"\nNuméro de telephone :"+tel+"\nVotre contact : "+login+"\nVille : "
    		+ville+"\nQuartier : "+Quartier+"\nAdresse : "+adresse+"\nPrix total : "+prixTotal+" DT \n\nVous serez livrer dans les 30 minutes \nMerci d'avoir choisi Fiona cooking";
    
    	   return FactureTotal;
       }
  
}
 