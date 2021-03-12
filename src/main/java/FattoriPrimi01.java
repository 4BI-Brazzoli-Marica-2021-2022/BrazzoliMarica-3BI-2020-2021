//Author Brazzoli Marica
//Dato un numero naturale fattorizzarlo in fattori primi.

import java.util.Scanner;
public class FattoriPrimi01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num, n;
        n=2;
        System.out.println("Inserisci un numero");
        num = input.nextInt();
        while (num!=1){
            if (num%n==0){
                num=num/n;
                System.out.print(n);
                if(n!=1){
                    System.out.print(" * ");
                }
            }
            else{
                n++;
            }
        }
    }
}
