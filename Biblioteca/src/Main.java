import BackEnd.Libro;
import BackEnd.Mensola;
import utility.Tools;

import static utility.Tools.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean opzione = false;
        boolean esci = true;
        Scanner tastiera = new Scanner(System.in);
        ArrayList<Libro> lista = new ArrayList<>();
        Mensola libreria = new Mensola(0);
        String[] opzioni = {"BIBLIOTECA", "Inserimento", "Visualizzazione", "Fine"};

        do {
            switch (Menu(opzioni, tastiera)) {
                case 1 -> {
                    try {
                        if (!libreria.checkSpace()) {
                            Libro libro = Tools.leggiLibro(tastiera, opzione);
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> {
                    
                }
            }
        }while(!esci);
    }
}