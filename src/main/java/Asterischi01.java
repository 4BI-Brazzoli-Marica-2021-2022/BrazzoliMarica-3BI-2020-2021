//Author Brazzoli Marica
/*Scrivere un programma Asterischi che chiede all’utente di inserire un numero intero e stampa un triangolo 
fatto di asterischi con un numero di righe pari al valore inserito dall’utente. Se l’utente inserisce un valore negativo 
il programma deve visualizzare un messaggio di errore.
Esempio di esecuzione:
Inserisci un numero 6
Ecco il triangolo corrispondente :
*
**
***
****
*****
******
*/
import java.util.Scanner;

public class Asterischi01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, m;
        System.out.println("Inserisci un numero");
        n = input.nextInt();
        for (i=1; i<=n; i++){
            for (m=1; m<=i; m++){
                System.out.print("*");
            }
            System.out.println( );
        }
    }
}