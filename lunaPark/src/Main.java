import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static utility.Tools.*;


public class Main {
    public static void main(String[] args) {
        int nBiglietto = 0;
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        final int MAXPERSONE = 10;
        ArrayList<Persona> gestore = new ArrayList<>();
        String[] opzioni = {"GESTORE LUNAPARK", "Entrata", "Uscita", "Nuova Giostra", "Fine"};

        do{
            try {
                switch (Menu(opzioni, sc)) {
                    case 1 -> {
                        if (gestore.size() < MAXPERSONE) {
                            gestore.add(registraEntrata(nBiglietto));
                            nBiglietto++;
                        } else
                            throw new Exception("Il lunapark è pieno");
                    }

                    case 2 -> {

                    }

                    case 4 ->{
                        esci = true;
                    }
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }while(!esci);
    }

    public static Persona registraEntrata(int nBiglietto){
        Persona cliente = new Persona();
        cliente.biglietto = nBiglietto;
        Random rn = new Random();

        switch (rn.nextInt(0, 4)){
            case 1 -> cliente.giostreUsate = giostre.ruotaPanoramica;
            case 2 -> cliente.giostreUsate = giostre.autoscontro;
            case 3 -> cliente.giostreUsate = giostre.ottovolante;
            case 4 -> cliente.giostreUsate = giostre.tagada;
        }

        return cliente;
    }
    public static int findIndex(ArrayList<Persona> gestore, int nBiglietto){
        for(int i = 0; i < gestore.size(); i++){
            if(gestore.get(i).biglietto == nBiglietto){
                return i;
            }
        }
        return -1;
    }
}