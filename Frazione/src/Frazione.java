public class Frazione {
    private int numeratore;
    private int denominatore;

    public Frazione(int nominatore, int denominatore) throws Exception {
        if(denominatore == 0){
            throw new Exception("Il denominatore non può essere nullo");
        }
        this.numeratore = nominatore;
        this.denominatore = denominatore;
    }

    public Frazione sommaFrazioni(Frazione addendo) throws Exception{
        int numNuovo;
        int denNuovo = 0;
        if(this.denominatore != addendo.denominatore) {
            denNuovo = this.denominatore * addendo.denominatore;
        } else
            denNuovo = this.denominatore;
        numNuovo = (denNuovo / this.denominatore) * this.numeratore + (denNuovo / addendo.denominatore) * addendo.numeratore;

        return new Frazione(numNuovo, denNuovo);
    }
    public double sommaFrazioneValore(Frazione addendo) throws Exception{
        int numNuovo;
        int denNuovo = 0;
        double risultato;
        if(this.denominatore != addendo.denominatore) {
            denNuovo = this.denominatore * addendo.denominatore;
        } else
            denNuovo = this.denominatore;
        numNuovo = (denNuovo / this.denominatore) * this.numeratore + (denNuovo / addendo.denominatore) * addendo.numeratore;
        Frazione nuovo = new Frazione(numNuovo, denNuovo);
        risultato = (double) numNuovo / denNuovo;
        return risultato;
    }

    @Override
    public String toString() {
        return numeratore + "/" + denominatore;
    }
}
