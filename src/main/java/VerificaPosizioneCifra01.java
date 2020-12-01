//Author Brazzoli Marica
/*
Dato un numero naturale il programma verifica se ogni sua cifra è maggiore o uguale al numero che rappresenta la 
posizione della cifra stessa (la posizione delle unità è rappresentata da 0, delle decine 1, delle centinaia 2…) e alla 
fine dice se questa proprietà è rispettata o meno dal numero in esame.
*/
import java.util.Scanner;
public class VerificaPosizioneCifra01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, positivi, somma;
        somma=0;
        positivi=0;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();
        while (num1!=0){
                
                System.out.println("Inserisci un nuovo numero");
                num1 = input.nextInt();
        }
        System.out.println("Hai inserito " + positivi+ " numeri positivi e la loro somma è " + somma);
    }
}
