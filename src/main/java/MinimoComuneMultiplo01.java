//Author Brazzoli Marica
//Dati due numeri naturali (diversi da zero) trovare il loro minimo comune multiplo.

import java.util.Scanner;

public class MinimoComuneMultiplo01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2, mcm;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        num2 = input.nextInt();
        mcm=num2;
        if (num1>0 && num2>0){
            while (mcm%num1!=0){
                mcm=mcm+num2;
            }
            System.out.println("Il minimo comune multiplo di "+num1+" e "+num2+" è "+mcm);
        }
        else if (num1<=0){
            System.out.println("Numero uno errato");
        }
        else if (num2<=0){
            System.out.println("Numero due errato");
        }
    }
}
