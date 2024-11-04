import mensola.Libro;
import frontScreen.FrontEnd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.Menu;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Esercizio con le liste", "Inserimento", "Visualizza", "Rimuovi", "Modifica Pagine", "Visualizza Prezzo dei Libri", "Scorri mensola", "Fine"};
        ArrayList<Libro> mensola = new ArrayList<>();
        final int MAXLIBRI = 3;
        boolean esci = false;

        do{
            switch (Menu(opzioni, tastiera)){
                case 1 -> {
                    try {
                        if (mensola.size() < MAXLIBRI) {
                            Libro nuovo = FrontEnd.leggiLibro(tastiera);
                            if (!verifica(mensola, nuovo)) {
                                mensola.add(nuovo);
                            } else
                                throw new Exception("Il libro è già presente");
                            }
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                    }

                case 2 ->{
                    if(!mensola.isEmpty()){
                        mensola.forEach(m-> System.out.println(m.toString()));
                    } else
                        System.out.println("Mensola vuota");
                }

                case 3 ->{
                    if(!mensola.isEmpty()){
                        Libro nuovo = new Libro();
                        System.out.println("Inserisci l'autore");
                        nuovo.Autore = tastiera.nextLine();
                        System.out.println("Inserisci il titolo");
                        nuovo.Titolo = tastiera.nextLine();
                        /*if(rimuoviLibro(mensola, nuovo) != null){
                            System.out.println("libro rimosso");
                        } else
                            System.out.println("Libro non trovato");
                            */
                         mensola.removeIf(m -> mensola.contains(nuovo));
                    }
                }

                case 4 ->{
                    if(!mensola.isEmpty()){
                        Libro nuovo = new Libro();
                        System.out.println("Inserisci l'autore");
                        nuovo.Autore = tastiera.nextLine();
                        System.out.println("Inserisci il titolo");
                        nuovo.Titolo = tastiera.nextLine();
                        int posizione = findIndex(mensola, nuovo);
                        if(posizione != -1){
                            System.out.println("Inserisci il numero nuovo di pagine");
                            nuovo.pagine = Integer.parseInt(tastiera.nextLine());
                            mensola.get(posizione).pagine = nuovo.pagine;
                            System.out.println("Pagine modificate");
                        } else
                            System.out.println("Libro non trovato");
                    }
                }
                case 5 ->{
                    if(!mensola.isEmpty()){
                        mensola.forEach(m -> System.out.println(m.prezzo()));
                    }
                }
                case 6 ->{
                    String[] opzioniMensola = {"Scorrimento", "Indietro", "Avanti"};
                    System.out.println("Da che posizione vuoi partire?");
                    int posizione = tastiera.nextInt();

                    switch (Menu(opzioniMensola, tastiera)){
                        case 1 ->{
                            if(!mensola.isEmpty()){
                                preach(mensola, posizione);
                            } else
                                System.out.println("non ci sono libri precedenti");
                        }
                        case 2 ->{
                            if(!mensola.isEmpty()){
                                such(mensola, posizione);
                            } else
                                System.out.println("non ci sono libri successivi");
                        }
                    }
                }

                case 7 ->{
                    esci = true;
                    System.out.println("uscita");
                }

            }
        }while(!esci);
    }

    public static boolean verifica(ArrayList<Libro> mensola, Libro nuovo){
        for(int i=0; i< mensola.size();i++){
            if(mensola.get(i).Autore.equals(nuovo.Autore) && mensola.get(i).Titolo.equals(nuovo.Titolo)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Libro> rimuoviLibro(ArrayList<Libro> mensola, Libro nuovo){
        int posizione = findIndex(mensola, nuovo);
        if(posizione != -1) {
            mensola.remove(posizione);
            return mensola;
        }
        return null;
    }

    public static int findIndex(ArrayList<Libro> mensola, Libro nuovo){
        for(int i=0; i< mensola.size();i++){
            if(mensola.get(i).Autore.equals(nuovo.Autore) && mensola.get(i).Titolo.equals(nuovo.Titolo)){
                return i;
            }
        }
        return -1;
    }
    //get preach libro, get such Libro
    //parto dalla posizione data, such mi da il libro dopo, preach torna indietro
    public static void preach(ArrayList<Libro> mensola, int posizione){
        if(posizione >=0 && posizione <= 2){
            System.out.println(mensola.get(posizione -1));

        }
    }
    public static void such(ArrayList<Libro> mensola, int posizione){
        if(posizione >=0 && posizione <= 2){
            System.out.println(mensola.get(posizione + 1));
        }
    }
}
