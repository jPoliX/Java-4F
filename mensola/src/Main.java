import mensola.Libro;
import frontScreen.FrontEnd;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        final int MAXLIBRI = 3;
        Libro[] mensola = new Libro[MAXLIBRI];
        int i = 0; // numero di libri
        double costoTotale = 0.0;

        while (i < MAXLIBRI) {
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
        }

        System.out.println("Totale: " + i + " libri");
        System.out.printf("Costo totale: %.3f euro", costoTotale);
    }
}