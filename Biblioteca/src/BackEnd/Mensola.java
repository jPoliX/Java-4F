package BackEnd;
import java.util.ArrayList;

public class Mensola {
    private int nLibri;

    public Mensola(int nLibri) {
        this.nLibri = nLibri;
    }
    public boolean addLibro(Libro l){
        return getMensola().add(l);
    }
    private ArrayList<Libro> getMensola(){
        ArrayList<Libro> lista = new ArrayList<>();
        return lista;
    }
}
