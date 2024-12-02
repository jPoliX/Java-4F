public class Main {
    public static void main(String[] args) {
        Cronometro cronometro = new Cronometro();
        try { // Per far andare lo sleep
            cronometro.avvia();
            Thread.sleep(2500); // Attende 2,5 secondi
            System.out.println("Durata corrente: " + cronometro.getDurataFormattata());
            cronometro.ferma();
            System.out.println("Durata finale: " + cronometro.getDurataFormattata());
            cronometro.reset();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}