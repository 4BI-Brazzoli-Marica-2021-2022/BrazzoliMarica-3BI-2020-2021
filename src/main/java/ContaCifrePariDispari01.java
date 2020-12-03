//Author Brazzoli Marica
/*
Dopo aver fatto inserire un numero naturale il programma restituisce in output da quante cifre pari 
e da quante cifre dispari è composto il numero.
*/
import java.util.Scanner;
public class ContaCifrePariDispari01 {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int num,  cifrepari, cifredispari;
        cifrepari=0;
        cifredispari=0;
        System.out.println("Inserisci un numero");
        num = input.nextInt();
        while (num!=0){
            if((num%10)%2==0){
                cifrepari++;
            }
            else{
                cifredispari++;
            }
            num/=10;
        }
        System.out.println("Il numero che hai inserito ha "+cifrepari+" cifre pari e "+cifredispari+" cifre dispari");
    }
}
