//Author Brazzoli Marica
/*
Scrivere un programma MediaNumeri che chiede all’utente di inserire una sequenza di numeri interi positivi. 
Non appena l’utente inserisce un numero negativo il programma si arresta e visualizza la media aritmetica dei valori 
positivi inseriti (senza approssimazione!).
 */
import java.util.Scanner;
public class MediaNumeri01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, num1, i;
        double media, somma;
        somma=0;
        System.out.println("Quanti numeri vuoi inserire");
        n = input.nextInt();
        for (i=1; i<=n; i++){
            System.out.println("Inserisci il numero");
            num1 = input.nextInt();
            somma=somma+num1;
        }
        media=somma/n;
        System.out.println("La media dei numeri "+media);    
    }
}