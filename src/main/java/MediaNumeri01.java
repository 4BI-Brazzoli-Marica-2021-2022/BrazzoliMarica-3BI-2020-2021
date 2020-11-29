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
        int num1, num2, cont, somma; 
        float media;
        somma=0;
        cont=0;
        System.out.println("Inserisci un numero");
        num2 = input.nextInt();
        while (num2>=0){
            num1=num2;
            somma=num1+somma;
            System.out.println("Inserisci il prossimo numero");
            num2 = input.nextInt();
            somma=num2+somma;
            System.out.println(somma);
        }
        media=somma/cont;
        System.out.println("La media dei numeri "+media);    
    }
}