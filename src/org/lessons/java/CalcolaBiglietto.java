package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		//INIZIALIZZO SCANNER
		Scanner in = new Scanner(System.in);
		
		//CHIEDO I KM DA PERCORRERE
		System.out.println("Inserisci in numero di Km da percorrere");
		int userKm = in.nextInt();
		
		//CHIEDO QUANTI ANNI HA
		System.out.println("Inserisci la tua età");
		int userAge = in.nextInt();
		
		System.out.println("km inseriti " + userKm + "km");		
		System.out.println("La tua età " + userAge);
		
		
		if(userAge < 18) {
			int sconto = userKm * 20 / 100;
			int price = userKm - sconto;
			System.out.println("Il prezzo del tuo biglietto è " + price * 0.21);
		}
		if(userAge > 65) {
			int sconto = userKm * 40 / 100;
			int price = userKm - sconto;
			System.out.println("Il prezzo del tuo biglietto è " + price * 0.21);
		} else {
			System.out.println("Il prezzo del tuo biglietto è " + userKm * 0.21);
		}
		//CHIUDO FLUSSO DI INFORMAZIONI
		in.close();
		
	}
}
