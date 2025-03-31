import java.util.Scanner;
public class Manuale extends Libro {
    private String argomento;

    // Costruttore
    public Manuale(String nome, String descrizione, String autore, int ISBN, double prezzo, int quantità, String argomento) {
        super(nome, descrizione, autore, ISBN, prezzo, quantità);
        this.argomento = argomento;
    }

    @Override
    public void leggi(Scanner sc) {
        super.leggi(sc);  // Chiamo il metodo leggi() della classe Libro per gli attributi comuni
        System.out.println("Inserisci l'argomento del manuale:");
        argomento = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Argomento: " + argomento;
    }
}
