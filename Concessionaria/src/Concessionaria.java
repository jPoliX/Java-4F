import utility.Tools;

import java.util.ArrayList;
import java.util.Scanner;

public class Concessionaria {
    private ArrayList<Veicolo> concessionaria = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addVeicolo(Veicolo v) throws Exception {
        if (!concessionaria.contains(v)) {
            concessionaria.add(v);
        } else {
            throw new Exception("Veicolo già presente");
        }
    }

    public int numVeicoli() {
        return concessionaria.size();
    }

    public void stampaCollezione() {
        for (int i = 0; i < concessionaria.size(); i++) {
            System.out.println(concessionaria.get(i));
        }
    }

    public Veicolo leggiVeicolo(Scanner sc) {
        System.out.println("Inserisci la marca");
        String marca = sc.nextLine();
        System.out.println("Inserisci il modello");
        String modello = sc.nextLine();
        System.out.println("Inserisci il prezzo");
        int prezzo = Integer.parseInt(sc.nextLine());

        String[] opzioni = {"Opzioni", "Automobile", "Moto"};
        int scelta = Tools.Menu(opzioni, sc);
        if (scelta == 1) {
            System.out.println("Inserisci numero di porte");
            int nPorte = Integer.parseInt(sc.nextLine());
            return new Automobile(marca, prezzo, modello, nPorte);
        } else {
            System.out.println("Inserisci cilindrata");
            int cilindrata = Integer.parseInt(sc.nextLine());
            return new Moto(marca, prezzo, modello, cilindrata);
        }
    }

    public void rimuoviVeicolo() {
        System.out.println("Inserisci la marca del veicolo da eliminare:");
        String marca = sc.nextLine();
        System.out.println("Inserisci il modello del veicolo da eliminare:");
        String modello = sc.nextLine();

        boolean rimosso = concessionaria.removeIf(v -> v.getMarca().equalsIgnoreCase(marca) && v.getModello().equalsIgnoreCase(modello));
        if (rimosso) {
            System.out.println("Veicolo rimosso con successo.");
        } else {
            System.out.println("Nessun veicolo trovato");
        }
    }

    public boolean trovaVeicolo() {
        System.out.println("Inserisci la marca: ");
        String marca = sc.nextLine();
        System.out.println("Inserisci il modello: ");
        String modello = sc.nextLine();

        for (int i = 0; i < concessionaria.size(); i++) {
            Veicolo v = concessionaria.get(i);
            if (v.getMarca().equalsIgnoreCase(marca) && v.getModello().equalsIgnoreCase(modello)) {
                return true;
            }
        }
        return false;
    }

    public boolean modificaPrezzo(Scanner sc) throws Exception {
        System.out.print("Inserisci la marca del veicolo: ");
        String marca = sc.nextLine();
        System.out.print("Inserisci il modello del veicolo: ");
        String modello = sc.nextLine();
        for (Veicolo v : concessionaria) {
            if (v.getMarca().equalsIgnoreCase(marca) && v.getModello().equalsIgnoreCase(modello)) {
                System.out.print("Inserisci il nuovo prezzo: ");
                int nuovoPrezzo = Integer.parseInt(sc.nextLine());
                v.setPrezzo(nuovoPrezzo);
                System.out.println("Prezzo aggiornato con successo!");
                return true;
            }
        }
        throw new Exception("Veicolo non trovato");
    }

    //stampare veicoli di una certa marca, modificare prezzo, visualizzare i veicoli coon prezzo inferiore al prezzo dato, aggiungere camion
    public void stampaInferiore(int prezzo) {
        for (int i = 0; i < concessionaria.size(); i++) {
            if (concessionaria.get(i).getPrezzo() < prezzo && prezzo >= 0) {
                System.out.println(concessionaria.get(i));
            }
        }
    }

    public void stampaMarca(String marca) {
        for (int i = 0; i < concessionaria.size(); i++) {
            if (concessionaria.get(i).getMarca().equalsIgnoreCase(marca)) {
                System.out.println(concessionaria.get(i));
            }
        }
    }
}