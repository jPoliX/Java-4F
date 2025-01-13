package BackEnd;

import java.util.ArrayList;
import java.util.Scanner;

public class Mensola {
    private int nLibri;
    private final int MAXLIBRI = 3;
    private ArrayList<Libro> mensola = new ArrayList<>();

    public Mensola(int nLibri) {
        this.nLibri = nLibri;
    }

    public void addLibro(Libro l) throws Exception {
        if (l != null && !mensola.contains(l) && nLibri < MAXLIBRI) {
            mensola.add(l);
        } else
            throw new Exception("Il libro è già presente nella mensola");
    }

    public boolean checkSpace() throws Exception {
        boolean piena = true;
        if (nLibri == MAXLIBRI)
            throw new Exception("La mensola è piena");
        else
            return false;
    }
    public ArrayList<Libro> getVolumi(){
        ArrayList<Libro> nuovaMensola = new ArrayList<>();
        for(int i = 0; i < mensola.size(); i++){
            nuovaMensola.add(new Libro(mensola.get(i)));
        }
        return nuovaMensola;
    }
}