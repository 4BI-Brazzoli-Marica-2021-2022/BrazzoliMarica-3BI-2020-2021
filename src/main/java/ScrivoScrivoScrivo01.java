//Author Brazzoli Marica
/*
Scrivere un programma ScrivoScrivoScrivo che chiede all’utente di inserire un 
numero maggiore o uguale a zero e stampa il messaggio sto ciclando un numero di volte 
pari al numero inserito dall’utente. Se il valore inserito dall’utente `e negativo il programma stampa un messaggio di errore.
Esempio di esecuzione:
Inserisci un numero : 5
sto ciclando sto ciclando sto ciclando sto ciclando sto ciclando
*/
import java.util.Scanner;
public class ScrivoScrivoScrivo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num, n;
        System.out.println("Inserisci un numero, che può essere maggiore o uguale a 0");
        num = input.nextInt();
        if (num>=0){
            for (n=0; n<num; n++){
                System.out.printf("Sto ciclando ");
            }
        }
        else {
            System.out.println("Numero errato");
        }
    }
}
