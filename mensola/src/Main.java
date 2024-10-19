import mensola.Libro;
import frontScreen.FrontEnd;

import java.util.Scanner;

import static utility.Tools.Menu;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 3;
        Libro[] mensola = new Libro[MAXLIBRI];
        int i = 0; // numero di libri
        double costoTotale = 0.0;
        String[] opzioni = {"App Libri", "Inserimento", "Visualizza", "Ricerca", "Visualizza un libro","Fine"};
        boolean fine = false;

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    try {
                        if (i < MAXLIBRI) {
                            mensola[i] = FrontEnd.leggiLibro(tastiera);
                            i++;
                        } else {
                            throw new Exception("la libreria è piena");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 2 -> {
                    if (i > 0) {
                        visualizza(mensola, i);
                    } else
                        System.out.println("non ci sono libri");
                }

                //confronta autore e titolo
                case 3 -> {
                    if (i > 0) {
                        Libro nuovo = new Libro();
                        System.out.println("inserisci l'autore:");
                        nuovo.Autore = tastiera.nextLine();
                        System.out.println("inserisci il titolo:");
                        nuovo.Titolo = tastiera.nextLine();
                        int posizione = ricerca(mensola, i, nuovo);
                        try {
                            if (posizione != -1) {
                                System.out.println("Il libro è presente in posizione: " + posizione);
                            } else
                                throw new Exception("il libro non è presente");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } else {
                        System.out.println("Non ci sono libri nella mensola");
                    }
                }
                case 4 ->{
                    if(i>0){
                        Libro nuovo = new Libro();
                        System.out.println("inserisci l'autore:");
                        nuovo.Autore = tastiera.nextLine();
                        System.out.println("inserisci il titolo:");
                        nuovo.Titolo = tastiera.nextLine();
                        get(mensola, i, nuovo);
                    }
                }
                case 5 -> {
                    fine = true;
                    System.out.println("uscita");
                }

            }
        } while (!fine);

    }

    public static int ricerca(Libro[] mensola, int numeroLibriInseriti, Libro nuovo) {
        for (int i = 0; i < numeroLibriInseriti; i++) {
            if (mensola[i] != null && mensola[i].Autore.equals(nuovo.Autore) && mensola[i].Titolo.equals(nuovo.Titolo)) {
                return i;
            }
        }
        return -1;
    }

    public static void visualizza(Libro mensola[], int numeroLibriAggiunti) {
        for (int i = 0; i < numeroLibriAggiunti; i++) {
            if (mensola[i] != null) {
                System.out.println(mensola[i].FormattaDati());
            }
        }
    }

    public static void get(Libro[] mensola, int numeroLibriInseriti, Libro nuovo) {
        for (int i = 0; i < numeroLibriInseriti; i++) {
            if (mensola[i] != null && mensola[i].Autore.equals(nuovo.Autore) && mensola[i].Titolo.equals(nuovo.Titolo)) {
              visualizza(mensola, numeroLibriInseriti);
            }
        }
    }
}
