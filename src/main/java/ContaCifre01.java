//Author Brazzoli Marica
//Dopo aver fatto inserire un numero naturale il programma restituisce in output da quante cifre è composto il numero.

import java.util.Scanner;
public class ContaCifre01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num, ncifre;
        ncifre=1;
        System.out.println("Inserisci un numero");
        num = input.nextInt();
        if (num>=0){
            while (num/10>0){
                ncifre++;
                num=num/10;
            }
            System.out.println("Il numero che hai inserito ha "+ncifre+" cifre");
        }
        else {
            System.out.println("Numero errato");
        }
    }
}
