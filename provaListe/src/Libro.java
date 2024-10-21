public class Libro {
    public String autore;
    public String titolo;
    public int pagine;

    @Override
    public String toString(){
        return String.format("Autore: %s Titolo: %s Pagine: %d", autore,titolo,pagine);
    }
}

