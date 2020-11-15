//Author Brazzoli Marica
/*
Far inserire una serie numerica di interi fermandosi quando 
viene inserito due volte consecutive lo stesso numero e visualizzarlo.
 */

import java.util.Scanner;
public class NumeroRipetuto01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2;
        num1 = 0;
        System.out.println("Inserisci il numero");
        num2 = input.nextInt();
        do {
            num1 = num2;
            System.out.println("Inserisci un nuovo numero");
            num2 = input.nextInt();
        }
        while (num2!=num1);
        System.out.println("Hai inserito due volte il numero " +num1); 
    }
}