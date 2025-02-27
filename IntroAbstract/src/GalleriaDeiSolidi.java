import java.util.ArrayList;

public class GalleriaDeiSolidi {
    ArrayList<Solido> galleria = new ArrayList<>();

    public void inserisciSolido(Solido solido) throws CloneNotSupportedException {
        if (!galleria.contains(solido)) {
            galleria.add(solido.clone());
        }
    }
    public ArrayList<Solido> getLista() throws CloneNotSupportedException {
        ArrayList<Solido> lista = new ArrayList<>();
        for(Solido s : galleria){
            lista.add(s.clone());
        }
        return lista;
    }
}
