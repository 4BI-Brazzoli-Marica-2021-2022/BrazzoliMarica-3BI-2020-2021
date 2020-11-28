//Author Brazzoli Marica
/*
Scrivere un programma IndovinaZero che chiede all’utente di 
inserire numeri interi uno dopo l’altro fino a quando non inserisce il numero 0.
*/
import java.util.Scanner;
public class IndovinaZero01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int cont, num1, num2;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();
        while (num1!=0){
            System.out.println("Inserisci un nuovo numero");
            num2 = input.nextInt();
            num1=num2;
        }
        System.out.println("Hai inserito il numero zero");
    }
}
