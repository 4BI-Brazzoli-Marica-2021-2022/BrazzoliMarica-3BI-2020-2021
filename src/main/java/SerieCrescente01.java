//Author Brazzoli Marica
/*
Leggere una serie di numeri interi passati dall’utente, 
fermandosi al primo numero che rende la serie non crescente e restituendo 
quanti numeri erano stati inseriti.
 */

import java.util.Scanner;
public class SerieCrescente01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2, numinseriti;
        numinseriti = 0;
        System.out.println("Inserisci il numero");
        num2 = input.nextInt();
        numinseriti++;
        do {
            num1 = num2;
            System.out.println("Inserisci un nuovo numero");
            num2 = input.nextInt();
            numinseriti++;
        }
        while (num2<=num1);
        System.out.println("Hai inserito " +numinseriti+ " numeri"); 
    }
}