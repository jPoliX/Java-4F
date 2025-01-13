package utility;
import BackEnd.Genere;
import BackEnd.Libro;

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
    public static Libro leggiLibro(Scanner tastiera, boolean opzioni){
        String[] sceltaGenere = {"Romanzo", "Manuale", "Thriller", "Generico"};
        System.out.println("Inserisci l'autore del libro");
        String autore = tastiera.nextLine();
        System.out.println("Inserisci il titolo del libro");
        String titolo = tastiera.nextLine();
        System.out.println("Inserisci il numero pagine del libro");

        // Usa nextLine() e poi prova a convertire in intero
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

        Libro l = new Libro(autore, titolo, nPagine);
        Menu(sceltaGenere, tastiera);
        return l;
    }
    public void visualizzaMensola(ArrayList<Libro> volumi){
        for(Libro l : volumi){
            clrScr();
            l.toString();
        }
    }
}