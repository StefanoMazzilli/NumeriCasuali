package org.generation.italy;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numGenerati, random, i;
		ArrayList<Integer> listaRandom=new ArrayList<Integer>();
		String risposta= new String();
		
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		do {
			System.out.print("Quanti numeri vuoi generare? ");
			numGenerati=sc.nextInt();
			sc.nextLine();
			
			while (numGenerati<=0) {
				System.out.print("\nValore inserito non valido, inserisci un numero positivo! Riprova: ");
				numGenerati=sc.nextInt();
				sc.nextLine();
			}
			
			//inizio il ciclo for per generare tutti i numeri random
			for (i=0; i<numGenerati; i++) {
				//ciclo do while per assicurarmi che se il numero generato già esiste allora ne genero un altro
				do {
					random=r.nextInt(100)+1;
					//confronto il numero generato con tutta la lista
				} while (listaRandom.contains(random));
				//se esco dal ciclo allora il numero generato è un numero nuovo
				listaRandom.add(random);
			}
			
			//una volta generati tutti i numeri li mostro
			System.out.println("\n\nI numeri generati sono: ");
			for (i=0; i<listaRandom.size(); i++) {
				System.out.println("- "+listaRandom.get(i));
			}
			listaRandom.clear();
			
			System.out.println("\nVuoi generare nuovi numeri?");
			risposta= sc.nextLine().toLowerCase();
			while (!(risposta.equals("si"))&&!(risposta.equals("sì"))&&!(risposta.equals("no"))) {
				System.out.println("\nScusa, non ho capito. Puoi ripetere?");
				risposta= sc.nextLine().toLowerCase();
			}
			System.out.println();
		}while(risposta.substring(0, 1).equals("s"));
		System.out.println("\nArrivederci!");
		
		sc.close();
	}

}
