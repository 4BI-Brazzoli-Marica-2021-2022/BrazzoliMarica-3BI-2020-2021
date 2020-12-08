//Author Brazzoli Marica
/*
Scrivere un programma java che preso in ingresso un numero intero x e una sequenza di 10 valori interi,
conti e visualizzi in uscita quanti di questi 10 numeri sono divisibili per x (visualizzare in output solo il numero)
*/
import java.util.Scanner;
public class NumeriDivisibili {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int val, x, cont, y, i;
        cont=0;
        val=10;
        System.out.println("Inserisci un numero");
        x = input.nextInt();
        for (i=1; i<=val; i++){
            System.out.println("Inserisci un altro numero");
            y = input.nextInt();
            if (y%x==0){
                cont++;
            }
        }
        System.out.println("I numeri positivi che hai inserito sono " +cont);
    }
}