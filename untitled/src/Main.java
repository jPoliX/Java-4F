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
        String[] opzioni = {"Esercizio con le liste", "Inserimento", "Visualizza","Fine"};
        ArrayList<Libro> mensola = new ArrayList<>();
        final int MAXLIBRI = 3;
        boolean esci = false;

        do{
            switch (Menu(opzioni, tastiera)){
                case 1 ->{
                    if(mensola.size() < MAXLIBRI){
                        try {
                            Libro nuovo = FrontEnd.leggiLibro(tastiera);
                            if (!verifica(mensola, nuovo)) {
                                mensola.add(nuovo);
                            } else
                                throw new Exception("Il libro è già presente");
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }

                    }
                }
                case 2 ->{
                    if(!mensola.isEmpty()){
                        visualizza(mensola);
                    } else
                        System.out.println("Mensola vuota");
                }
                case 3 ->{
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
    public static void visualizza(ArrayList<Libro> mensola){
        mensola.forEach(m -> System.out.println(m.toString()));
    }
}
