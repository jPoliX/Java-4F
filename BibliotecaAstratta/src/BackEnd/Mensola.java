package BackEnd;

import java.util.ArrayList;

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
        if (nLibri == MAXLIBRI)
            throw new Exception("La mensola è piena");
        else
            return false;
    }

    public ArrayList<Libro> getVolumi() {
        ArrayList<Libro> nuovaMensola = new ArrayList<>();
        for (int i = 0; i < mensola.size(); i++) {
            Libro libro = mensola.get(i);
            if (libro instanceof Romanzo) {
                nuovaMensola.add(new Romanzo((Romanzo) libro));
            } else if (libro instanceof Manuale) {
                nuovaMensola.add(new Manuale((Manuale) libro));
            } else if (libro instanceof Thriller) {
                nuovaMensola.add(new Thriller((Thriller) libro));
            }
        }
        return nuovaMensola;
    }

    public Libro cercaLibro(String autore, String titolo) {
        for (Libro libro : mensola) {
            if (libro.getAutore().equals(autore) && libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public boolean rimuoviLibro(Libro libro) {
        if (mensola.contains(libro)) {
            mensola.remove(libro);
            nLibri--;
            return true;
        }
        return false;
    }

    public void visualizza() {
        for (Libro libro : mensola) {
            System.out.println(libro.dettagli());
        }
    }
}
