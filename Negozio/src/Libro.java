import java.util.Scanner;

/**
 * @author Alessio Poli
 * @version
 */
public class Libro implements Prodotto {
    private String nome;
    private String descrizione;
    private String autore;
    private int ISBN;
    private double prezzo;
    private int quantità;

    public Libro(String nome, String descrizione, String autore, int ISBN, double prezzo, int quantità) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.ISBN = ISBN;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }

    @Override
    public void leggi(Scanner sc) {
        System.out.println("Inserisci il nome del libro:");
        nome = sc.nextLine();
        System.out.println("Inserisci la descrizione del libro:");
        descrizione = sc.nextLine();
        System.out.println("Inserisci l'autore del libro:");
        autore = sc.nextLine();
        System.out.println("Inserisci l'ISBN del libro:");
        ISBN = Integer.parseInt(sc.nextLine());
        System.out.println("Inserisci il prezzo del libro:");
        prezzo = Double.parseDouble(sc.nextLine());
        System.out.println("Inserisci la quantità del libro:");
        quantità = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void crea() {
        System.out.println("Libro creato: " + nome);
    }

    @Override
    public void elimina() {
        System.out.println("Libro eliminato: " + nome);
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Autore: %s, ISBN: %d, Prezzo: %.2f, Quantità: %d", nome, autore, ISBN, prezzo, quantità);
    }
}
