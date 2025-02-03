import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        Concessionaria c = new Concessionaria();
        String[] opzioni = {"MENU", "INSERISCI VEICOLO", "VISUALIZZA VEICOLI", "RIMUOVI VEICOLO", "MODIFICA PREZZO VEICOLO", "CERCA VEICOLI PER MARCA", "CERCA VEICOLI PER PREZZO", "ESCI"};
        do {
            switch (Menu(opzioni, sc)) {
                case 1 -> {
                    Veicolo v = c.leggiVeicolo(sc);
                    try {
                        c.addVeicolo(v);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 2 -> c.stampaCollezione();
                case 3 -> c.rimuoviVeicolo();
                case 4 -> {
                    try {
                        c.modificaPrezzo(sc);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                case 5 -> {
                    System.out.println("Inserisci la marca");
                    String marca = sc.nextLine();
                    c.stampaMarca(marca);
                }
                case 6 -> {
                    System.out.println("Inserisci il prezzo");
                    int prezzo = Integer.parseInt(sc.nextLine());
                    c.stampaInferiore(prezzo);
                }
                case 7 -> esci = true;
                default -> System.out.println("Opzione inserita non valida");
            }
        } while (!esci);
    }
}