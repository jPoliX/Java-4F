import java.util.ArrayList;
import java.util.Scanner;
import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <Libro> mensola = new ArrayList<>();
        final int MAXLIBRI = 3;
        boolean esci = false;
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Mensola", "Inserimento", "Visualizza", "Esci"};

        do{
            switch (Menu(opzioni, tastiera)){
                case 1 ->{
                    try {
                        if(mensola.size() < MAXLIBRI) {
                            mensola.add(inserisci(tastiera));
                        } else
                            throw new Exception("Mensola piena");
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case 2 ->{
                    if(!mensola.isEmpty()){
                        visualizza(mensola);
                    }
                }
                case 3 ->{
                    esci = true;
                    System.out.println("uscita dal programma");
                }
            }
        }while(!esci);

    }

    public static Libro inserisci(Scanner tastiera){
        Libro nuovo = new Libro();
        System.out.println("Inserisci l'autore del libro: ");
        nuovo.autore = tastiera.nextLine();
        System.out.println("Inserisci il titolo del libro: ");
        nuovo.titolo = tastiera.nextLine();
        System.out.println("Inserisci le pagine del libro: ");
        nuovo.pagine = Integer.parseInt(tastiera.nextLine());

        return nuovo;
    }

    public static void visualizza(ArrayList<Libro> mensola){
        mensola.forEach(libro -> System.out.println(libro.toString()));
    }
}