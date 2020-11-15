//Author Brazzoli Marica
/*
Creare un programma che, dati due valori che rappresentano rispettivamente
a) il tasso di propagazione di un virus (quante nuove persone ogni giorno si ammalano per ogni persona già ammalata) e
b) la quantità di persone di una popolazione, dica quanti giorni sono necessari perché sia ammalata almeno la metà della popolazione considerando che all’inizio ci sia una sola persona ammalata.
 */

import java.util.Scanner;
public class PopolazioneAmmalata01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int giorni, malati, totpersone, tasso;
        giorni = 0;
        malati = 1;
        System.out.println("Inserisci il numero degli abitanti");
        totpersone= input.nextInt();
        System.out.println("Inserisci il tasso del contagio");
        tasso= input.nextInt();
        while (malati<(totpersone/2)){           
            malati = malati + (malati*tasso);
            System.out.println("Il numero dei malati è " + malati);
            giorni++;
        }
        System.out.println("I giorni necessari che servono per far ammalare almeno la metà della popolazione sono " +giorni);
    }
}