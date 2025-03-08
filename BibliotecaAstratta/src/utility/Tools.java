package utility;
import BackEnd.Thriller;
import BackEnd.Genere;
import BackEnd.Libro;
import BackEnd.Manuale;
import BackEnd.Livello;
import BackEnd.Romanzo;

import java.util.ArrayList;
import java.util.Scanner;

public class Tools {
    /*public static void main(String[] args) {

    }*/
    private Tools()
    {}; //impedisce di istanziare la classe
    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int Menu(String opzioni[], Scanner tastiera) { // parametri formali
        int scelta;

        do {
            clrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "]" + " " + opzioni[i]);
            }
            scelta = (Integer.parseInt(tastiera.nextLine()));
            //tastiera.nextLine();
            if ((scelta < 1) || (scelta > opzioni.length - 1)) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1) || (scelta > opzioni.length - 1));
        //tastiera.nextLine();
        return scelta;
    }
    public static Libro leggiLibro(Scanner tastiera, boolean opzioni) {
        String[] sceltaGenere = {"Romanzo", "Manuale", "Thriller"};
        System.out.println("Inserisci l'autore del libro:");
        String autore = tastiera.nextLine();
        System.out.println("Inserisci il titolo del libro:");
        String titolo = tastiera.nextLine();
        System.out.println("Inserisci il numero di pagine del libro:");

        int nPagine = -1;
        while (nPagine < 1) {
            try {
                String input = tastiera.nextLine();
                nPagine = Integer.parseInt(input);
                if (nPagine < 1) {
                    System.out.println("Il numero di pagine deve essere maggiore di 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero valido per le pagine.");
            }
        }

        // Chiedi all'utente di scegliere il tipo di libro
        int scelta = Menu(sceltaGenere, tastiera);
        switch (scelta) {
            case 1:
                return new Romanzo(autore, titolo, nPagine, Genere.ROMANZoSTORICO);
            case 2:
                System.out.println("Inserisci l'argomento del manuale:");
                String argomento = tastiera.nextLine();
                System.out.println("Inserisci il livello del manuale (BASE, PRINCIPIANTE, ESPERTO):");
                Livello livello = Livello.valueOf(tastiera.nextLine().toUpperCase());
                return new Manuale(autore, titolo, nPagine, argomento, livello);
            case 3:
                System.out.println("Il libro fa parte di una serie? (true/false)");
                boolean serie = Boolean.parseBoolean(tastiera.nextLine());
                return new Thriller(autore, titolo, nPagine, serie);
            default:
                return null;
        }
    }

    public void visualizzaMensola(ArrayList<Libro> volumi){
        for(Libro l : volumi){
            clrScr();
            l.toString();
        }
    }
}