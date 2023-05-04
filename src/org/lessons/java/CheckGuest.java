package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci il tuo nome per vedere se sei stato invitato?");
		String name = in.nextLine();
		in.close();
		
		String[] listaInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis, Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		for(int i = 0; i < listaInvitati.length; i++) {
			
			String nameList = listaInvitati[i];
			
			if(name.equals(nameList)) {
				System.out.println("Puoi entrare");
				return;
			}
		}
		System.out.println("Non puoi entrare");
		
	}
}
