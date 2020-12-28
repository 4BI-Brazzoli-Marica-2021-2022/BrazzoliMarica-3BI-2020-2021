//Author Brazzoli Marica
//Dati due numeri stamparne il massimo comun divisore.

import java.util.Scanner;
public class MassimoComunDivisore01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2, min, max, i;
        System.out.println("Inserisci un numero");
        num1 = input.nextInt();
        System.out.println("Inserisci il secondo numero");
        num2 = input.nextInt();
        if (num1<num2){
            min=num1;
            max=num2;
        }
        else{
            max=num1;
            min=num2;
        }
        for(i=min; min%i==0 && max%i==0;i--){
            i=i;
        }
        System.out.println(i);
    }
}
