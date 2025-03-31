import java.util.Scanner;

import static utility.Tools.Menu;

public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        NegozioElettronica negozio = new NegozioElettronica();
        String[] opzioni = {"MENU", "AGGIUNGI SMARTPHONE", "AGGIUNGI MANUALE", "VISUALIZZA PRODOTTI", "RIMUOVI PRODOTTO", "CERCA PRODOTTO", "ESCI"};

        do {
            switch (Menu(opzioni, sc)) {
                case 1 -> {
                    System.out.println("Inserisci il codice prodotto:");
                    String codiceProdotto = sc.nextLine();
                    System.out.println("Inserisci la marca:");
                    String marca = sc.nextLine();
                    System.out.println("Inserisci il prezzo:");
                    double prezzo = Double.parseDouble(sc.nextLine());
                    System.out.println("Inserisci il modello:");
                    String modello = sc.nextLine();
                    System.out.println("Inserisci la memoria (GB):");
                    int memoria = Integer.parseInt(sc.nextLine());

                    Smartphone smartphone = new Smartphone(codiceProdotto, marca, prezzo, modello, memoria);
                    negozio.aggiungiProdotto(smartphone);
                    System.out.println("Smartphone aggiunto!");
                }
                case 2 -> {
                    Manuale manuale;
                    manuale.leggi(sc);
                    negozio.aggiungiProdotto(manuale);
                    System.out.println("Manuale aggiunto!");
                }
                case 3 -> {
                    System.out.println("=== PRODOTTI NEL NEGOZIO ===");
                    negozio.visualizzaProdotti();
                }
                case 4 -> {
                    System.out.println("Inserisci il codice prodotto da rimuovere:");
                    String codice = sc.nextLine();
                    negozio.rimuoviProdotto(codice);
                    System.out.println("Prodotto rimosso!");
                }
                case 5 -> {
                    System.out.println("Inserisci il codice prodotto da cercare:");
                    String codice = sc.nextLine();
                    Prodotto prodotto = negozio.cercaProdotto(codice);
                    if (prodotto != null) {
                        System.out.println("Prodotto trovato: " + prodotto);
                    } else {
                        System.out.println("Prodotto non trovato.");
                    }
                }
                case 6 -> esci = true;
                default -> System.out.println("Opzione inserita non valida");
            }
        } while (!esci);
    }
}