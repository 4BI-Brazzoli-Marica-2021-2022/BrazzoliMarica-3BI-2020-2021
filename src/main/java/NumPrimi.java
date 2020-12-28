
import java.util.Scanner;

public class NumPrimi {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int n, i, div, cont;
        cont=0;
        System.out.println("Inserisci quanti numeri primi vuoi stampare");
        n = input.nextInt();
        System.out.println("I primi " + n + " numeri primi sono:");
        for (i=1; i<=n; i++){
            if(i%2!=0 || i==2){
                System.out.println(i);
            }
        }    
    }
}
