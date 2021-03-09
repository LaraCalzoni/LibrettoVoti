package it.polito.tdp.libretto.model;

import java.time.LocalDate;

//POJO - Plain Old Java Object
// Java Bean 
// classe "stupida", è un semplice contenitore di dati, non ha "logica"


//inserisco "/**" davanti a una classe o a un metodo e premo invio e si prepara un blocco di commento, in cui scrivo cosa fa la classe/metodo
/**
 * Memorizza il risultato di un esame singolo
 * @author Lara Calzoni
 *
 */

public class Voto {

private String nome;
private int voto; //30L come lo implemento?
private LocalDate data; //data superamento esame

/**
 * Costruttore della classe Voto
 * @param nome Nome del corso superato
 * @param voto Voto ottenuto
 * @param data Data di superamento
 */
public Voto(String nome, int voto, LocalDate data) {
	super();
	this.nome = nome;
	this.voto = voto;
	this.data = data;
}

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}

@Override
public String toString() {
	return "Esame " + nome + " superato con " + voto + " il " + data ;
}


	
}
