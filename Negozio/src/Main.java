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
                    System.out.println("[1] Smartphone\n[2] Libro\n[3] Manuale");

                    int tipoProdotto = 0;
                    try {
                        tipoProdotto = Integer.parseInt(sc.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Errore: inserisci un numero valido.");
                        continue;
                    }

                    switch (tipoProdotto) {
                        case 1 -> {
                            try {
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

                                Smartphone smartphone = new Smartphone(codiceProdotto, marca, prezzo, modello, memoria));
                                negozio.aggiungiProdotto(smartphone);
                            } catch (NumberFormatException e) {
                                System.out.println("Errore nell'inserimento dei dati numerici. Riprova.");
                            }
                        }
                        case 2 -> {
                            try {
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
                                int quantita = Integer.parseInt(sc.nextLine());

                                Libro libro = new Libro(nome, descrizione, autore, ISBN, prezzo, quantita));
                                negozio.aggiungiProdotto(libro);
                            } catch (NumberFormatException e) {
                                System.out.println("Errore nell'inserimento dei dati numerici. Riprova.");
                            }
                        }
                        case 3 -> {
                            try {
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
                                int quantita = Integer.parseInt(sc.nextLine());
                                System.out.println("Inserisci l'argomento:");
                                String argomento = sc.nextLine();

                                Manuale manuale = new Manuale(nome, descrizione, autore, ISBN, prezzo, quantita, argomento));
                                negozio.aggiungiProdotto(manuale);
                            } catch (NumberFormatException e) {
                                System.out.println("Errore nell'inserimento dei dati numerici. Riprova.");
                            }
                        }
                        default -> System.out.println("Opzione non valida.");
                    }
                }
                case 2 -> negozio.visualizzaProdotti();

                case 3 -> {
                    System.out.println("Inserisci il nome del prodotto da rimuovere:");
                    String nomeProdotto = sc.nextLine();
                    negozio.rimuoviProdotto(nomeProdotto);
                }

                case 4 -> {
                    System.out.println("Inserisci il nome del prodotto da cercare:");
                    String nomeProdotto = sc.nextLine();
                    Prodotto prodotto = negozio.cercaProdotto(nomeProdotto);
                    if (prodotto != null) {
                        prodotto.leggi();
                    } else {
                        System.out.println("Prodotto non trovato.");
                    }
                }

                case 5 -> esci = true;

                default -> System.out.println("Opzione non valida.");
            }
        } while (!esci);
    }
}
