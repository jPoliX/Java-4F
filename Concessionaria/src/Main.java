
public class Main {
    public static void main(String[] args) {
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
            c.rimuoviVeicolo();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}