package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	//inizialmente definirla come List, deciderò dopo se arrayList o LinkedList
	private List <Voto> voti;
	
	public Libretto() {
		//qua inizializzo nuova variabile come un nuovo oggetto, quando creo nuovo oggetto devo decidere se AList o LList
		this.voti = new ArrayList <>(); 
	}
	
	public void add(Voto v) {
		this.voti.add(v);
		
	}
	public String toString() {
		String s = "";
		for(Voto v: this.voti) {
			s+= v.toString()+'\n';
			
		}
		return s;
	}
}
