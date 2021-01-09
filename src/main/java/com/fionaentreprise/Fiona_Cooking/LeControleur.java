package com.fionaentreprise.Fiona_Cooking;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import com.fionaentreprise.Fiona_Cooking.Dao.ArticleRepository;
//import com.fionaentreprise.Fiona_Cooking.Dao.UtilisateurRepository;
import com.fionaentreprise.Fiona_Cooking.Service.AcheterMesArticles;
import com.fionaentreprise.Fiona_Cooking.Service.GervaisMail;
import com.fionaentreprise.Fiona_Cooking.Service.Page;
import com.fionaentreprise.Fiona_Cooking.data.Article;
import com.fionaentreprise.Fiona_Cooking.data.Utilisateur;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

@Controller
public class LeControleur {
    
	@Resource
	AcheterMesArticles achat;
	@Resource
	Utilisateur utilisateur;
	@Resource
	Article article;
//	@Resource
//	UtilisateurRepository session;
//	@Resource
//	ArticleRepository sessionArticle;
	
	 static Logger logger = Logger.getLogger(LeControleur.class);
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String HOME(final ModelMap model) {
	
	
        DOMConfigurator.configure("log4j.xml");
 
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page d'acceuil");
		
		return "pages/index";
	}
	
	@RequestMapping(value="/NousContacter", method = RequestMethod.GET)
	public String NousContacter(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page Nouscontacter");
		
		return "pages/NousContacter";
	}
	
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String HOME1(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page d'acceuil");
		
		return "pages/index";
	}
	
	@RequestMapping(value="/menu", method = RequestMethod.GET)
	public String menu(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu");
		return "pages/menu";
	}
   
	@RequestMapping(value="/menu1", method = RequestMethod.GET)
	public String menu1(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu1");
		
		return "pages/menu1";
	}
	
	@RequestMapping(value="/menu2", method = RequestMethod.GET)
	public String menu2(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu2");
		return "pages/menu2";
	}
	
	@RequestMapping(value="/menu3", method = RequestMethod.GET)
	public String menu3(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu3");
		
		return "pages/menu3";
	}
	
	@RequestMapping(value="/menu4", method = RequestMethod.GET)
	public String menu4(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu4");
		
		return "pages/menu4";
	}
	
	@RequestMapping(value="/menu5", method = RequestMethod.GET)
	public String menu5(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu5");
		
		return "pages/menu5";
	}
	
	@RequestMapping(value="/menu6", method = RequestMethod.GET)
	public String menu6(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu6");
		
		return "pages/menu6";
	}
	
	@RequestMapping(value="/menu7", method = RequestMethod.GET)
	public String menu7(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
	    logger.debug("Je suis rentré avec succès dans la page menu7");
		
		return "pages/menu7";
	}
	
	@RequestMapping(value="/menu8", method = RequestMethod.GET)
	public String menu8(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page menu8");
		
		return "pages/menu8";
	}
	
	
	
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public String about(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page a propos de nous");
		
		return "pages/about";
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public String contact(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page contact");
		
		return "pages/contact";
	}
	
	@RequestMapping(value="/messagerie", method = RequestMethod.GET)
	public String messagerie(final ModelMap model) {
	    DOMConfigurator.configure("log4j.xml");
	    
        //Log in console in and log file
        logger.debug("Je suis rentré avec succès dans la page mes élement");
		
		return "pages/elements";
	}
	
	
	@RequestMapping(value="/Votre_commande", method = RequestMethod.POST)
	public String Votre_commande(final ModelMap model, @RequestParam(value = "nom") final String nom
			,@RequestParam(value = "prenom") final String prenom
			,@RequestParam(value = "login") final String login
			,@RequestParam(value = "tel") final String tel
			,@RequestParam(value = "ville") final String ville
			,@RequestParam(value = "quartier") final String quartier
			,@RequestParam(value = "adresse") final String adresse
			,@RequestParam(value = "complement") final String complement
			,@RequestParam(value = "boisson") final String boisson
			,@RequestParam(value = "article") final String monarticle
			,@RequestParam(value = "prixTotal") final String prixTotal
			,@RequestParam(value = "suplement") final String suplement
			,@RequestParam(value = "Prixsuplement") final String Prixsuplement) {
		
		 DOMConfigurator.configure("log4j.xml");
		    
	        //Log in console in and log file
	        logger.debug("Je suis rentré avec succès dans la page Votre_commande");
			
		
       String Mon_Menu;
       logger.debug("le supplement est :"+suplement+"\nPrix Total :"+Prixsuplement+" DT\n");
	
		if(complement.equals("")|| boisson.equals("")) {
			
			Mon_Menu = Page.retour_Page(monarticle ); 
			model.addAttribute("message", "vous devez ajouter un complément et une boisson à ce plat");
			model.addAttribute("te", "");
		}else {
			utilisateur.setAdresse(adresse);
			utilisateur.setNom(nom);
			utilisateur.setPrenom(prenom);
			utilisateur.setQuartier(quartier);
			utilisateur.setVille(ville);
			utilisateur.setTel(tel);
			utilisateur.setLogin(login);
			
			String accompagnement = complement+" + "+boisson+"\n"+suplement;
			
			article.setAccompagnement(accompagnement);
			article.setArticle(monarticle);
			int prixtotal1 = Integer.parseInt(prixTotal);
			int prixTotalsuplementaire = Integer.parseInt(Prixsuplement);
			int prixTotalF = prixtotal1 + prixTotalsuplementaire;
			article.setPrixTotal(prixTotalF);
			
			
		    String MaFacture = achat.factures(utilisateur, article);
		    model.addAttribute("prenom", prenom);
			
			logger.debug(MaFacture);
			
			String host= "smtp.gmail.com";
			String port ="587";
			String userName = "fionacooking33@gmail.com";
			String password = "fionalysia";
			
			try {
				
				logger.debug("Je tente d'envoyer le mail");
				GervaisMail.sendPlainTextEmail(host, port, userName, password,login , "Votre facture ", MaFacture);           
				//  Send("elshopgabon33", "fionalysia",login , "", "TEST", MaFacture);
				
//				session.save(utilisateur);
//				sessionArticle.save(article);
			} catch (AddressException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Mon_Menu = "pages/Votre_commande";
		}
	
		return Mon_Menu ;
	}
	
	
}
