//Author Brazzoli Marica
/*
Scrivere un programma MediaVettore che chiede all’utente di inserire una sequenza di 
numeri frazionari terminata da 0,0, memorizza tutti i valori in un vettore (anche se non 
sarebbe strettamente indispensabile) e al termine stampa la media dei valori inseriti.
 */
import java.util.*;
public class MediaVettore01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cont = 0;
        Vector<Double> vett = new Vector<Double>();
        double n, media, somma=0;
        System.out.println("Inserisci un numero");
        n=input.nextDouble();
        somma=n;
        while(n!=0.0){
            System.out.println("Inserisci un nuovo numero");
            n=input.nextDouble();
            vett.addElement(n);
        }
        for(int m=0; m<vett.size(); m++){
            somma=somma+vett.elementAt(m);
        }
        media=somma/vett.size();
        System.out.println("La media totale è " +media);
    }
}


