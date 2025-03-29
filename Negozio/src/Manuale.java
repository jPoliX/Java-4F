public class Manuale extends Libro {
    private String argomento;

    // Costruttore
    public Manuale(String nome, String descrizione, String autore, int ISBN, double prezzo, int quantità, String argomento) {
        super(nome, descrizione, autore, ISBN, prezzo, quantità);
        this.argomento = argomento;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    @Override
    public void leggi() {
        super.leggi();
        System.out.println("Argomento: " + argomento);
    }

    @Override
    public String toString() {
        return super.toString() + ", Argomento: " + argomento;
    }
}
