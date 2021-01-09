package com.fionaentreprise.Fiona_Cooking.data;

import java.util.List;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;

import org.springframework.stereotype.Service;


@Service
//@Entity // This tells Hibernate to make a table out of this class
//@Table(name = "Utilisateur")
public class Utilisateur {
    
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	private  Long idUser;
//	
//	@Column(name="nom")
//	private String nom;
//	
//	@Column(name="prenom")
//	private String prenom;
//	
//	@Column(name="tel")
//	private String tel;
//	
//	@Column(name="login")
//	private String login;
//	
//	@Column(name="Ville")
//	private String Ville;
//	
//	@Column(name="Quartier")
//	private String Quartier;
//	
//	@Column(name="adresse")
//	private String adresse;
	
	
	
	private  Long idUser;

	private String nom;
	

	private String prenom;
	

	private String tel;
	

	private String login;
	

	private String Ville;

	private String Quartier;
	

	private String adresse;
	
	
	
	public Long getIdUser() {
		return idUser;
	}



	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public String getVille() {
		return Ville;
	}



	public void setVille(String ville) {
		Ville = ville;
	}



	public String getQuartier() {
		return Quartier;
	}



	public void setQuartier(String quartier) {
		Quartier = quartier;
	}



	public String getAdresse() {
		return adresse;
	}



	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}



	public List<Article> getArticles() {
		return articles;
	}



	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}



//	@OneToMany(mappedBy = "userArticle", cascade = CascadeType.ALL)
	private List<Article> articles;
	
	
	
	
	
	

	
	
}
