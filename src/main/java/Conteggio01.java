//Author Brazzoli Marica
/*
Scrivere un programma Conteggio che chiede all’utente di inserire un numero maggiore 
o uguale a zero e stampa uno dopo l’altro tutti i numeri da 0 al numero inserito compreso. 
Se il valore inserito dall’utente è negativo il programma stampa un messaggio di errore.
Esempio di esecuzione: Inserisci un numero : 5
Ecco il risultato : 0 1 2 3 4 5
*/
import java.util.Scanner;
public class Conteggio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int cont, num, n;
        System.out.println("Inserisci un numero, che può essere maggiore o uguale a 0");
        num = input.nextInt();
        if (num>=0){
            for (n=0; n!=num; n++){
                System.out.println(n+" ");
            }
            System.out.println(n);
        }
        else {
            System.out.println("Numero errato");
        }
    }
}
