//Author Brazzoli Marica
/*
Scrivere un programma ContaNumeriCrescenti che chiede all’utente di inserire una sequenza di numeri interi 
crescenti (man mano sempre più grandi) e ne stampa la lunghezza (il numero di valori inseriti dall’utente). 
Il programma termina non appena l’utente inserisce un valore minore o uguale al precedente). 
Esempio di esecuzione:
Inserisci il prossimo numero : -6
Inserisci il prossimo numero : -2
Inserisci il prossimo numero : 5
Inserisci il prossimo numero : 9
Inserisci il prossimo numero : 7
Hai immesso una sequenza di numeri crescenti lunga 4 1
 */
import java.util.Scanner;
public class ContaNumeriCrescenti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numpre, numdopo;
        System.out.println("Inserire un numero");
        numdopo = input.nextInt();
        do {
            numpre=numdopo;
            System.out.println("Inserisci il prossimo numero");
            numdopo = input.nextInt();
        }
        while (!(numpre>numdopo || numpre==numdopo));
        if (numpre==numdopo){
            System.out.println("Hai inserito due volte il numero " + numdopo);
        }
        else if (numpre>numdopo){
            System.out.println("Il numero che hai inserito " +numdopo+ " è minore del precedente " +numpre);
        }
    }
}
