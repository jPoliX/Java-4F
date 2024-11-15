public class Auto {
    private String scuderia;
    private Pilota pilota;
    private double cilindrata;

    public Auto(String scuderia, Pilota pilota, double cilindrata) {
        this.scuderia = scuderia;
        this.pilota = pilota;
        this.cilindrata = cilindrata;
    }

    @Override
    public String toString() {
        return "Scuderia:  " + scuderia + "  Pilota:  " + pilota + "  Cilindrata:  " + cilindrata;
    }
}
