package org.lessons.java;

public class CibiPreferiti {
	
	public static void main(String[] arg) {
		String[] cibiPreferiti = { "pizza", "pasta", "carne", "torta", "arancini", "focaccia", "getalo"};
		System.out.println("la lunghezza della classifica: " + cibiPreferiti.length);
		System.out.println("cibo top: " + cibiPreferiti[0]);
		System.out.println("cibo preferito ma non troppo: " + cibiPreferiti[cibiPreferiti.length - 1]);
		System.out.println("BONUS cibo medio: " + cibiPreferiti[(cibiPreferiti.length - 1) / 2]);
	}
}
