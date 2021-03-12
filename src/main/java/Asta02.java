//Author Brazzoli Marica
/*
Come nell’esercizio Asta_01 c’è un’asta tra due compratori, 
questa volta i compratori a turno non effettuano nuove offerte 
specificando la cifra della nuova offerta, ma specificano il rilancio 
sulla propria offerta precedente. Qualora il rilancio non sia sufficiente a 
superare l’offerta dell’altro compratore viene richiesto un nuovo rilancio allo 
stesso. I compratori  possono ritirarsi dall’asta rilanciando 0. Alla fine 
dell’asta far stampare quale compratore si è aggiudicato l’asta e con che cifra.
 */
import java.util.Scanner;
public class Asta02 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        float n, vincita, prezzo;
        vincita=1;
        System.out.println("Dai un'offerta");
        n=input.nextFloat();
        prezzo=0;
        while (n>=0){
            prezzo=prezzo+n;
            System.out.println("Dai un'offerta");
            n=input.nextFloat();
            vincita++;
        }
        vincita--;
        if(vincita%2==0){
            System.out.println("Il vincitore dell'asta è il compratore uno");
        }
        else {
           System.out.println("Il vincitore dell'asta è il compratore due"); 
        }
    }
}