package utility;

enum Genere{
    romanzo,
    manuale,
    thriller
}
public class Libro {

    public String autore;
    public String titolo;
    final double COSTOPAGINA = 0.05;
    public int pagine;



    public String formattaDati(){
        return String.format("Autore: %s Titolo: %s PrezzoLibro: %f", autore, titolo, COSTOPAGINA * pagine);
    }

}
