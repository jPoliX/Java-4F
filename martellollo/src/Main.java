import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        Scanner sc = new Scanner(System.in);
        Concessionaria c = new Concessionaria();
        Veicolo v1 = new Veicolo("Ferrari", 20, "Ferrari");
        Automobile a1 = new Automobile("Lamborghini", 10, "Lamborghini", 2);
        Moto m1 = new Moto("Suzuki", 5, "Moto", 500);
        try {
            c.addVeicolo(v1);
            c.addVeicolo(a1);
            c.addVeicolo(m1);
            System.out.println("Ci sono " + c.numVeicoli());
            c.stampaCollezione();
            //c.rimuoviVeicolo();

            /*System.out.println("Modifica prezzo:");
            do {
                if (c.trovaVeicolo()) {
                    System.out.println("Inserisci prezzo: ");
                    c.modificaPrezzo(v1);
                    esci = true;
                }else System.out.println("Veicolo non trovato");
            }while(!esci);
            System.out.println(v1);*/
            System.out.println("--------------");
            if(!(c.stampaInferiore(10))){
                System.out.println("Nessun veicolo da visualizzare");
            }
            System.out.println("--------------");
            c.stampaMarca("lamborghini");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}