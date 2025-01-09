import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Automobile> lista = new ArrayList<>();
        Automobile a1 = new Automobile("a", "a", 1);
        Automobile a2 = new Automobile("a", "a", 1);
        if(a1.equals(a2)){
            System.out.println("Bravo patatino");
        }else
            System.out.println("Nullità");

        lista.add(a1);
        lista.add(a2);
        Collections.sort(lista); //ordinare crescente e descrescente
        lista.forEach(m -> m.toString());
    }
}