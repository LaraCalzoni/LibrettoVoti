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
	/*
	 
	//modo 1
	public void stampaVotiUguali( int punteggio) {
		//il libretto stampa da solo i voti
		System.out.println();
		
	}
	
	//modo 2
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti, sarà poi il chiamante a stamparli
		//ma cosa devo stampare?
		// -> solo il nome?
		// -> tutto il voto.toString()
	}
	*/
	
	//modo 3
	//(ha un difetto: espone all'esterno il tipo di struttura dati che ho usato)
	//restituisce solo i voti uguali al criterio
	public List <Voto> listaVotiUguali ( int punteggio){
	List <Voto> risultato = new ArrayList<>();
	for(Voto v: this.voti) {
		if(v.getVoto()==punteggio) {
			risultato.add(v); //è lo stesso oggetto che appartiene a due liste diverse
		}
	}
	return risultato;
	}
	
	//modo 4 
	//(il metodo migliore)
	public Libretto votiUguali(int punteggio) {
		Libretto risultato= new Libretto();
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v); 
			}
		}
	return risultato;
	}
	
	public String toString() {
		String s = "";
		for(Voto v: this.voti) {
			s+= v.toString()+'\n';
			
		}
		return s;
	}
}
