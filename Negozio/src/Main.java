import java.util.Scanner;
import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        NegozioElettronica negozio = new NegozioElettronica();
        String[] opzioni = {"MENU", "AGGIUNGI PRODOTTO", "VISUALIZZA PRODOTTI", "RIMUOVI PRODOTTO", "CERCA PRODOTTO", "ESCI"};

        do {
            switch (Menu(opzioni, sc)) {
                case 1 -> {
                    System.out.println("Seleziona tipo prodotto:");
                    System.out.println("[1] Elettronico\n[2] Libro\n[3] Manuale");
                    int tipoProdotto = Integer.parseInt(sc.nextLine());

                    if (tipoProdotto == 1) {
                        System.out.println("Inserisci il codice prodotto:");
                        String codiceProdotto = sc.nextLine();
                        System.out.println("Inserisci la marca:");
                        String marca = sc.nextLine();
                        System.out.println("Inserisci il prezzo:");
                        double prezzo = Double.parseDouble(sc.nextLine());
                        System.out.println("Inserisci il modello (solo per smartphone):");
                        String modello = sc.nextLine();
                        System.out.println("Inserisci la memoria (solo per smartphone):");
                        int memoria = Integer.parseInt(sc.nextLine());

                        Smartphone smartphone = new Smartphone(codiceProdotto, marca, prezzo, modello, memoria);
                        negozio.aggiungiProdotto((Prodotto) smartphone);
                    } else if (tipoProdotto == 2) { // Libro
                        System.out.println("Inserisci il nome del libro:");
                        String nome = sc.nextLine();
                        System.out.println("Inserisci la descrizione:");
                        String descrizione = sc.nextLine();
                        System.out.println("Inserisci l'autore:");
                        String autore = sc.nextLine();
                        System.out.println("Inserisci l'ISBN:");
                        int ISBN = Integer.parseInt(sc.nextLine());
                        System.out.println("Inserisci il prezzo:");
                        double prezzo = Double.parseDouble(sc.nextLine());
                        System.out.println("Inserisci la quantità:");
                        int quantità = Integer.parseInt(sc.nextLine());

                        Libro libro = new Libro(nome, descrizione, autore, ISBN, prezzo, quantità);
                        negozio.aggiungiProdotto(libro);
                    } else if (tipoProdotto == 3) {
                        System.out.println("Inserisci il nome del manuale:");
                        String nome = sc.nextLine();
                        System.out.println("Inserisci la descrizione:");
                        String descrizione = sc.nextLine();
                        System.out.println("Inserisci l'autore:");
                        String autore = sc.nextLine();
                        System.out.println("Inserisci l'ISBN:");
                        int ISBN = Integer.parseInt(sc.nextLine());
                        System.out.println("Inserisci il prezzo:");
                        double prezzo = Double.parseDouble(sc.nextLine());
                        System.out.println("Inserisci la quantità:");
                        int quantità = Integer.parseInt(sc.nextLine());
                        System.out.println("Inserisci l'argomento:");
                        String argomento = sc.nextLine();

                        Manuale manuale = new Manuale(nome, descrizione, autore, ISBN, prezzo, quantità, argomento);
                        negozio.aggiungiProdotto(manuale);
                    }
                }
                case 2 -> negozio.visualizzaProdotti();
                case 3 -> {
                    System.out.println("Inserisci il nome prodotto da rimuovere:");
                    String nomeProdotto = sc.nextLine();
                    negozio.rimuoviProdotto(nomeProdotto);
                }
                case 4 -> {
                    System.out.println("Inserisci il nome prodotto da cercare:");
                    String nomeProdotto = sc.nextLine();
                    Prodotto prodotto = negozio.cercaProdotto(nomeProdotto);
                    if (prodotto != null) {
                        prodotto.leggi();
                    } else {
                        System.out.println("Prodotto non trovato.");
                    }
                }
                case 5 -> esci = true;
                default -> System.out.println("Opzione inserita non valida");
            }
        } while (!esci);
    }
}
