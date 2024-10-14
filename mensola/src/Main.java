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
        String[] opzioni= { "App Libri", "Inserimento" , "Visualizza" , "Ricerca" , "Fine"};
        boolean fine=false;

        /* while (i < MAXLIBRI) {
            System.out.println("Vuoi aggiungere un libro? 'si' per aggiungere");
            String risposta = tastiera.nextLine();

            if (risposta.equals("si")) {
                mensola[i] = FrontEnd.leggiLibro(tastiera);
                System.out.println("Libro aggiunto");
                System.out.println(mensola[i].FormattaDati());
                costoTotale += mensola[i].pagine * mensola[i].PREZZOPAGINA;
                i++;
            } else {
                System.out.println("libro non aggiunto");
                break;
            }
        } */
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
                        FrontEnd.visualizza(mensola,MAXLIBRI);
                    } else
                        System.out.println("non ci sono libri");
                }
                //confronta autore
                case 3 ->{
                    if(i>MAXLIBRI){
                        Libro nuovo=new Libro();
                        nuovo.Autore=tastiera.nextLine();
                        if(ricerca(mensola , MAXLIBRI, nuovo)){
                            System.out.println("è già presente");
                        } else
                            System.out.println("non è presente");
                    }
                }
                case 4 -> {
                    fine=true;
                    System.out.println("uscita");
                }

            }
        }while(!fine);

    }
    public static boolean ricerca(Libro[] mensola, int max, Libro nuovo){
        for(int i=0;i<max;i++){
            if(mensola[i].Autore.equals(nuovo.Autore)){
                return true;
            }
        }
        return false;
    }
}
