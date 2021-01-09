package com.fionaentreprise.Fiona_Cooking.data;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;

import org.springframework.stereotype.Service;

@Service
//@Entity // This tells Hibernate to make a table out of this class
//@Table(name = "Article")
public class Article {
  

	
// @Id
// @GeneratedValue(strategy=GenerationType.AUTO)
// private Long id ;	
//
// @Column(name="article")
// private String article;
// 
// @Column(name="accompagnement")
// private String accompagnement;
// 
// @Column(name="prixTotal")
// private int prixTotal;
 
 

 private Long id ;	


 private String article;
 

 private String accompagnement;
 

 private int prixTotal;
 
 public String getAccompagnement() {
	return accompagnement;
}

public void setAccompagnement(String accompagnement) {
	this.accompagnement = accompagnement;
}


 public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getArticle() {
	return article;
}

public void setArticle(String article) {
	this.article = article;
}

public int getPrixTotal() {
	return prixTotal;
}

public void setPrixTotal(int prixTotal) {
	this.prixTotal = prixTotal;
}

public Utilisateur getUserArticle() {
	return userArticle;
}

public void setUserArticle(Utilisateur userArticle) {
	this.userArticle = userArticle;
}

//@ManyToOne
//	@JoinColumns({
//			@JoinColumn(name = "utilisateur_ID", referencedColumnName = "idUser")
//		}) 
private Utilisateur userArticle;






}
