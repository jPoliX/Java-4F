import BackEnd.Libro;
import BackEnd.Mensola;
import BackEnd.Romanzo;
import BackEnd.Manuale;
import BackEnd.Thriller;
import BackEnd.Livello;
import BackEnd.Genere;

import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean fine = false;
        Mensola mensola = new Mensola(0);
        String[] opzioni = {"BIBLIOTECA", "Inserimento", "Visualizzazione", "Ricerca", "Cancellazione", "Fine"};

        do {
            switch (Menu(opzioni, scanner)) {
                case 1: {
                    System.out.println("Scegli il tipo di libro da aggiungere:");
                    System.out.println("[1] Romanzo");
                    System.out.println("[2] Manuale");
                    System.out.println("[3] Thriller");
                    int tipoLibro = Integer.parseInt(scanner.nextLine());

                    System.out.println("Inserisci il titolo del libro:");
                    String titolo = scanner.nextLine();
                    System.out.println("Inserisci l'autore del libro:");
                    String autore = scanner.nextLine();
                    System.out.println("Inserisci il numero di pagine del libro:");
                    int nPagine = Integer.parseInt(scanner.nextLine());

                    Libro nuovoLibro = null;

                    switch (tipoLibro) {
                        case 1: {
                            System.out.println("Inserisci il genere del romanzo (es: ROMANZoSTORICO, FANTASY):");
                            String genereStr = scanner.nextLine();
                            Genere genere = Genere.valueOf(genereStr.toUpperCase());
                            nuovoLibro = new Romanzo(autore, titolo, nPagine, genere);
                            break;
                        }
                        case 2: {
                            System.out.println("Inserisci l'argomento del manuale:");
                            String argomento = scanner.nextLine();
                            System.out.println("Inserisci il livello (BASE, PRINCIPIANTE, ESPERTO):");
                            String livelloStr = scanner.nextLine();
                            Livello livello = Livello.valueOf(livelloStr.toUpperCase());
                            nuovoLibro = new Manuale(autore, titolo, nPagine, argomento, livello);
                            break;
                        }
                        case 3: {
                            System.out.println("Il libro fa parte di una serie (true/false)?");
                            boolean serie = Boolean.parseBoolean(scanner.nextLine());
                            nuovoLibro = new Thriller(autore, titolo, nPagine, serie);
                            break;
                        }
                        default:
                            System.out.println("Tipo di libro non valido");
                            break;
                    }
                    if (nuovoLibro != null) {
                        try {
                            mensola.addLibro(nuovoLibro);
                            System.out.println("Libro aggiunto con successo");
                        } catch (Exception e) {
                            System.out.println("Errore: " + e.getMessage());
                        }
                    }
                    break;
                }
                case 2: {
                    mensola.getVolumi().forEach(System.out::println);
                    break;
                }
                case 3: {
                    System.out.println("Inserisci il nome dell'autore da cercare:");
                    String autoreCerca = scanner.nextLine();
                    System.out.println("Inserisci il titolo del libro da cercare:");
                    String titoloCerca = scanner.nextLine();

                    Libro libroTrovato = mensola.cercaLibro(autoreCerca, titoloCerca);
                    if (libroTrovato != null) {
                        System.out.println("Libro trovato: " + libroTrovato.getTitolo() + " di " + libroTrovato.getAutore());
                    } else {
                        System.out.println("Libro non trovato");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Inserisci il titolo del libro da rimuovere:");
                    String titoloDaRimuovere = scanner.nextLine();
                    System.out.println("Inserisci l'autore del libro da rimuovere:");
                    String autoreDaRimuovere = scanner.nextLine();

                    Libro libroDaRimuovere = mensola.cercaLibro(autoreDaRimuovere, titoloDaRimuovere);
                    if (libroDaRimuovere != null) {
                        if (mensola.rimuoviLibro(libroDaRimuovere)) {
                            System.out.println("Libro rimosso con successo");
                        } else {
                            System.out.println("Errore nella rimozione del libro");
                        }
                    } else {
                        System.out.println("Libro non trovato");
                    }
                    break;
                }
                case 5: {
                    fine = true;
                    System.out.println("Uscita dal programma");
                    break;
                }
                default:
                    break;
            }
        } while (!fine);
    }
}
