public class Main {
    public static void main(String[] args) {
        double risultato = 0;
        try {
            Frazione frazione = new Frazione(1, 3);
            Frazione addendo = new Frazione(1,3);
            System.out.println("Il risultato in frazione è: " + frazione.sommaFrazioni(addendo));
            risultato = frazione.sommaFrazioneValore(addendo);
            System.out.println("IL risultato in decimale è: " + risultato);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}