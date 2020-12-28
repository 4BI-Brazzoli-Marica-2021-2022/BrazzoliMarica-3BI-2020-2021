//Author Brazzoli Marica
//Verificare se un numero passato dall’utente è primo (un numero è primo se è divisibile solo per 1 e per sè stesso)   

import java.util.Scanner;

public class NumeroPrimo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num, cont, i;
        cont=0;
        System.out.println("Dammi un numero");
        num = input.nextInt();
        for (i=1; i<=num; i++){
            if (num%i==0 || num==2){
                cont++;
            }
        }
        if (cont<=2){
            System.out.println("Il numero "+num+" è un numero primo");
        }
        else{
            System.out.println("Il numero "+num+" non è un numero primo");
        }
    }
}