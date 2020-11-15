//Author Brazzoli Marica
/*
Far inserire una serie numerica di interi fermandosi quando o la somma di due numeri 
consecutivi è pari a 10 o quando un numero è uguale al precedente del precedente nella serie numerica
 */
import java.util.Scanner;
public class SerieNumerica01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num1, num2, num3;
        num1 = 0;
        num2 = 0;
        num3 = 0;
        System.out.println("Inserisci un numero");
        num2 = input.nextInt();
        System.out.println("Inserisci un numero");
        num3 = input.nextInt();
        if (num2+num3 != 10){
            do {
            num1 = num2;
            num2 = num3;
            System.out.println("Inserisci un nuovo numero");
            num3 = input.nextInt();
            }
            while ((num2+num3 != 10) && (num1!=num3));
        }
    }
}