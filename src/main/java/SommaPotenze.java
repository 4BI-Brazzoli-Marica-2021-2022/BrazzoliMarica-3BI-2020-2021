//Author Brazzoli Marica
/*
Scrivere un programma java che preso in ingresso due numeri interi k e x, visualizzi in output la somma delle potenze di 2 con 
esponente da k a x con tutti i controlli necessari (visualizzare in output solo la somma)
*/
import java.util.Scanner;
public class SommaPotenze {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int x, k, i, max, min, somma, potenza;
        somma=0;
        potenza=1;
        System.out.println("Inserisci un numero");
        x = input.nextInt();
        System.out.println("Inserisci un altro numero");
        k = input.nextInt();
        if (x<=k){
            max=k;
            min=x;
        }
        else {
            max=x;
            min=k;
        }
        for (i=1; i<=min; i++){
            potenza*=2;
        }
        somma=potenza;
        for (i=1; i<=max; i++){
            potenza*=2;
            somma+=potenza;         
        }
        System.out.println("La somma delle potenze è "+somma);
    }
}