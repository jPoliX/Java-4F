import java.util.Scanner;
public class Smartphone extends ProdottoElettronico {
    private String modello;
    private int memoria;

    public Smartphone(String codiceProdotto, String marca, double prezzo, String modello, int memoria) {
        super(codiceProdotto, marca, prezzo);
        this.modello = modello;
        this.memoria = memoria;
    }

    public void leggi(Scanner sc) {
        System.out.println("Inserisci il codice prodotto dello smartphone:");
        setCodiceProdotto(sc.nextLine());

        System.out.println("Inserisci la marca dello smartphone:");
        setMarca(sc.nextLine());

        System.out.println("Inserisci il prezzo dello smartphone:");
        try {
            setPrezzo(Double.parseDouble(sc.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Errore: il prezzo deve essere un numero valido.");
            return;
        }

        System.out.println("Inserisci il modello dello smartphone:");
        modello = sc.nextLine();

        System.out.println("Inserisci la memoria (in GB) dello smartphone:");
        try {
            memoria = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Errore: la memoria deve essere un numero valido.");
            return;
        }
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Modello: %s Memoria: %d GB", modello, memoria);
    }
}
