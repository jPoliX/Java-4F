import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // st = st1 ==> confronta i due indirizzi di memoria
        /*
        try {
            Studente st = new Studente("Lionelo", "Pepsi", 8, 19);
            Studente st1 = new Studente("Lionelo", "Pepsi", 6, 19);
            st.setEta(89); //prende l'eccezione del metodo setEta
            System.out.println(st);
            System.out.println(st1);
            if(st.isEquals(st1)){
                System.out.println("Sono uguali");
            } else
                System.out.println("Non sono uguali");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Il programs continua...");

        int numeroMagico = tastiera.nextInt();
        try {
            if (numeroMagico < 100) {
                throw new Exception("Numero minore di 100");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(53);
        lista.add(22);
        lista.add(31);
        lista.add(2);
        lista.add(105);
        lista.add(6231);
        lista.add(632);
        lista.add(7);
        lista.add(9);
        System.out.println(lista);

        Collections.sort(lista); //permette di ordinare la lista, posso chiamare il metodo perchè STATICO
        System.out.println(lista);

        Collections.reverse(lista); //permette di rovesciare una lista, posso chiamare il metodo perchè STATICO
        System.out.println(lista);*/

        ArrayList<Studente> scolaresca = new ArrayList<>();
        scolaresca.add(new Studente("Lionelo","Pepsi",8,19));
        scolaresca.add(new Studente("Aldo","Moro",7,1));
        scolaresca.add(new Studente("Massimo Bossetti","L'Innocente",9,7));
        scolaresca.add(new Studente("Marchetto","Lazzarin",4,17));
        scolaresca.add(new Studente("Andrea","Diprè",5,43));
        Collections.sort(scolaresca);
        System.out.println(scolaresca);

    }
}
