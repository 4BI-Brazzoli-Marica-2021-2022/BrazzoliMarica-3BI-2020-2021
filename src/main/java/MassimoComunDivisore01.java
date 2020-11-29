//Author Brazzoli Marica
//Dati due numeri stamparne il massimo comun divisore.

import java.util.Scanner;
public class MassimoComunDivisore01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2, mcd;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        num2 = input.nextInt();
        mcd=1;
        if (num1>0 && num2>0){
            
            System.out.println("Il massimo comun divisore di "+num1+" e "+num2+" è "+mcd);
        }
        else if (num1<=0){
            System.out.println("Numero uno errato");
        }
        else if (num2<=0){
            System.out.println("Numero due errato");
        }
    }
}
