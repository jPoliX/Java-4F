import BackEnd.Libro;
import BackEnd.Mensola;
import utility.Tools;

import static utility.Tools.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean opzione = false;
        boolean esci = false;
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Libro> lista = new ArrayList<>();
        Mensola libreria = new Mensola(0);
        String[] opzioni = {"BIBLIOTECA", "Inserimento", "Visualizzazione", "Ricerca", "Cancellazione", "Fine"};

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1:
                    try {
                        if (!libreria.checkSpace()) {
                            Libro libro = Tools.leggiLibro(tastiera, opzione);
                            libreria.addLibro(libro);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    libreria.getVolumi().forEach(libro -> System.out.println(libro.toString()));
                    break;
                case 3:
                    System.out.println("Inserisci l'autore del libro da cercare:");
                    String autore = tastiera.nextLine();
                    System.out.println("Inserisci il titolo del libro da cercare:");
                    String titolo = tastiera.nextLine();
                    Libro trovato = libreria.cercaLibro(autore, titolo);
                    if (trovato != null) {
                        System.out.println("Libro trovato");
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                    break;
                case 4:
                    System.out.println("Inserisci l'autore del libro da cancellare:");
                    autore = tastiera.nextLine();
                    System.out.println("Inserisci il titolo del libro da cancellare:");
                    titolo = tastiera.nextLine();
                    Libro daCancellare = libreria.cercaLibro(autore, titolo);
                    if (daCancellare != null) {
                        if (libreria.rimuoviLibro(daCancellare)) {
                            System.out.println("Libro rimosso con successo.");
                        } else {
                            System.out.println("Errore nella rimozione del libro.");
                        }
                    } else {
                        System.out.println("Libro non trovato.");
                    }
                    break;
                case 5:
                    esci = true;
                    break;
            }
        } while (!esci);
    }
}