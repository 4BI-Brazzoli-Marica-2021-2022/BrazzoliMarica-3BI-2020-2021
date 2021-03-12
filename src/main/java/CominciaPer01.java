//Author Brazzoli Marica
/*
Scrivere un programma CominciaPer che chiede all’utente di inserire una sequenza 
di stringhe terminata dalla stringa vuota. Successivamente, chiede all’utente di 
inserire un carattere e stampa tutte le stringhe precedentemente inserite che 
iniziano con quel carattere.
 */
import java.util.*;
public class CominciaPer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vett = new Vector<String>();
        int i;
        char carat;
        System.out.println("Dammi in ingresso un stringa");
        String s = input.nextLine();
        while (!s.equals("")){
            System.out.println("Dammi in ingresso un stringa");
            s=input.nextLine();
            vett.addElement(s);
        }
        System.out.println("Inserisci una carattere");
        carat = input.next().charAt(0);
        System.out.println("Le parole che iniziano con quel carattere sono:");
        for (i = 0; i<vett.size(); i++){
            if (!vett.elementAt(i).equals("") && vett.elementAt(i).charAt(0) == carat) {
                System.out.println(vett.elementAt(i));
            }
        }
    }
}
