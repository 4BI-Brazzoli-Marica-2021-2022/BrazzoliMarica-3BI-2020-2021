//Author Brazzoli Marica
//Verificare se un numero passato dall’utente è primo (un numero è primo se è divisibile solo per 1 e per sè stesso)   

import java.util.Scanner;

public class NumeroPrimo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();       
        if (num1>0){
            if(num1%2==0){
                System.out.println("Il numero che hai inserito non è primo");
            }
            else {
                System.out.println("Il numero che hai inserito è primo");
            }
        }
        else if (num1<=0){
            System.out.println("Numero errato");
        }
    }
}
