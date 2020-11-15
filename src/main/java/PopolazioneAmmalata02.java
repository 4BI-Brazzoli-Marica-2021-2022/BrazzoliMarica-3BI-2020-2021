//Author Brazzoli Marica
/*
Dato un numero intero che rappresenta un numero di ammalati e un numero reale che rappresenta 
la percentuale di ammalati che ogni giorno guarisce, calcolare quanti giorni sono necessari affinché 
il numero di ammalati sia minore di 100.
 */

import java.util.Scanner;
public class PopolazioneAmmalata02 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int malati, percentualeguariti, giorni;
        giorni = 0;
        System.out.println("Inserisci il numero dei malati");
        malati = input.nextInt();
        System.out.println("Inserisci la percentuale dei guariti");
        percentualeguariti = input.nextInt();
        while (malati>=100){
            giorni ++;
            malati = malati - (malati*percentualeguariti/100);
            System.out.println("Giorno " + giorni + " Malati " + malati);
        }
        System.out.println("I giorni neccessari affinché il numero di ammalati sia minore di 100 è di " + giorni + " giorni");
    }
}