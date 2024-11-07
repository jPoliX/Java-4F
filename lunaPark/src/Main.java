import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static utility.Tools.*;


public class Main {
    public static void main(String[] args) {
        int nBiglietto = 0;
        int nPersone = 0;
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        final int MAXPERSONE = 10;
        ArrayList<Persona> lista = new ArrayList<>();
        String[] opzioni = {"GESTORE LUNAPARK", "Entrata", "Nuova Giostra", "Lista Giostre pre Biglietto", "Uscita", "Fine"};

        do{
                switch (Menu(opzioni, sc)) {
                    case 1 -> { //ingresso
                        try {
                            if (nPersone < MAXPERSONE) {
                                nPersone++;
                                Persona p = metodoCreazioneBiglietto(++nBiglietto);
                                lista.add(p);
                                System.out.println("numero assegnato al cliente: "+nBiglietto);
                            } else {
                                throw new Exception("Il lunapark è pieno");
                            }
                        }catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }

                    case 2 -> { //nuova giostra
                        System.out.println("Numero biglietto cliente: ");
                        int numeroB = Integer.parseInt(sc.nextLine());
                        Persona p = metodoNuovaGiostra(numeroB, sc);
                        lista.add(p);
                    }

                    case 4 ->{
                        esci = true;
                    }
                }
        }while(!esci);
    }

    public static Persona metodoCreazioneBiglietto(int nBiglietto){
        Persona cliente = new Persona();
        cliente.nBiglietto = nBiglietto;
        cliente.momentoEvento = LocalDateTime.now(); //momento ingresso
        return cliente;
    }
    public static Persona metodoNuovaGiostra(int nBiglietto, Scanner sc){
        Persona cliente = new Persona();
        boolean esci;
        do{
            try{
                System.out.println("Quale giostra vuoi provare? ");
                cliente.giostreProvate = ListaGiostre.valueOf(sc.nextLine().toUpperCase());
                esci = true;
            }catch (Exception e){
                System.out.println("Giostra non valida");
                esci = false;
            }
        }while(!esci);

        cliente.nBiglietto = nBiglietto;
        cliente.momentoEvento = LocalDateTime.now(); //momento nuova giostra
        return cliente;
    }
    public static int findIndex(ArrayList<Persona> gestore, int nBiglietto){
        for(int i = 0; i < gestore.size(); i++){
            if(gestore.get(i).nBiglietto == nBiglietto){
                return i;
            }
        }
        return -1;
    }
}
