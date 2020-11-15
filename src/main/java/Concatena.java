//Author:Brazzoli Marica
/*
 Scrivere un programma Concatena che chiede all’utente di inserire tre singole parole e 
le ristampa interponendovi un asterisco. 
Per esempio, se l’utente inserisce "gatto", "cane" e "topo" il programma stamperà <gatto*cane*topo>
 */
import java.util.Scanner;

public class Concatena {
    public static void main(String[] args) {
        String par1, par2, par3;
        Scanner input = new Scanner( System.in );
        System.out.println("Inserisci la prima parola");
        par1 = input.next();
        System.out.println("Inserisci la seconda parola");
        par2 = input.next();
        System.out.println("Inserisci la terza parola");
        par3 = input.next();
        System.out.println(par1 + "*" + par2 + "*" + par3); 
    }
}
