

import BackEnd.Libro;
import BackEnd.Mensola;

import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fine = false;
        Mensola mensola = new Mensola(0); // creiamo una mensola vuota
        String[] opzioni = {"BIBLIOTECA", "Inserimento", "Visualizzazione", "Ricerca", "Cancellazione", "Fine"};

        do {
            switch (Menu(opzioni, scanner)) {
                case 1: { // Inserimento
                    System.out.println("Inserisci il titolo del libro:");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci l'autore del libro:");
                    String autore = scanner.nextLine();
                    System.out.println("Inserisci l'anno di pubblicazione:");
                    int anno = Integer.parseInt(scanner.nextLine());

                    Libro nuovoLibro = new Libro(titolo, autore, anno);
                    try {
                        mensola.addLibro(nuovoLibro);
                        System.out.println("Libro aggiunto con successo!");
                    } catch (Exception e) {
                        System.out.println("Errore: " + e.getMessage());
                    }
                    break;
                }
                case 2: { // Visualizzazione
                    mensola.getVolumi().forEach(System.out::println);
                    break;
                }
                case 3: { // Ricerca
                    System.out.println("Inserisci il nome dell'autore da cercare:");
                    String autoreCerca = scanner.nextLine();
                    System.out.println("Inserisci il titolo del libro da cercare:");
                    String titoloCerca = scanner.nextLine();

                    Libro libroTrovato = mensola.cercaLibro(autoreCerca, titoloCerca);
                    if (libroTrovato != null) {
                        System.out.println("Libro trovato: " + libroTrovato.getTitolo() + " di " + libroTrovato.getAutore());
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                    break;
                }
                case 4: { // Cancellazione
                    System.out.println("Inserisci il titolo del libro da rimuovere:");
                    String titoloDaRimuovere = scanner.nextLine();
                    System.out.println("Inserisci l'autore del libro da rimuovere:");
                    String autoreDaRimuovere = scanner.nextLine();

                    Libro libroDaRimuovere = mensola.cercaLibro(autoreDaRimuovere, titoloDaRimuovere);
                    if (libroDaRimuovere != null) {
                        if (mensola.rimuoviLibro(libroDaRimuovere)) {
                            System.out.println("Libro rimosso con successo.");
                        } else {
                            System.out.println("Errore nella rimozione del libro.");
                        }
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                    break;
                }
                case 5: { // Fine
                    fine = true;
                    System.out.println("Uscita dal programma.");
                    break;
                }
                default:
                    break;
            }
        } while (!fine);

        scanner.close();
    }
}
