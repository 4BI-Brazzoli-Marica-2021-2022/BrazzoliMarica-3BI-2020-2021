//Author Brazzoli Marica
/*
Scrivere la classe Hit i cui oggetti rappresentano le hit musicali del momento. 
Ogni hit ha un titolo e un autore, e mette a disposizione il consueto metodo toString().
 */
import java.util.*;
public class Hit01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> vett = new Vector<String>();
        System.out.println("Dammi in ingresso un stringa");
        String Hit = input.nextLine();
        while (!Hit.equals("")){
            System.out.println("Dammi in ingresso un stringa");
            Hit=input.nextLine();
            vett.addElement(Hit);
        }
    }
}
