//Author Brazzoli Marica
/*
Scrivere un programma per il calcolo del fattoriale di un numero 
prestando attenzione agli opportuni controlli come intuibile dalla 
definizione sopra riportata
*/
import java.util.Scanner;
public class Fattoriale {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num, ris;
        System.out.println("Inserisci un numero");
        num = input.nextInt();
        ris=1;
        while (num>0){
            ris*=num;
            num--;
        }
        System.out.println("Il fattoriale è "+ris);
    }
}