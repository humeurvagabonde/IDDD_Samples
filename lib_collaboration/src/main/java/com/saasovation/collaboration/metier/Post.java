package com.saasovation.collaboration.metier;

import com.saasovation.referentiel.domain.model.IPersonne;

public class Post {

	private IPersonne personne;

	public IPersonne getPersonne() {
		return personne;
	}

	public void setPersonne(IPersonne personne) {
		this.personne = personne;
	}	
}
