public class Impiegato extends Dipendente {
    private String ufficio;

    public Impiegato(String nominativo, char genere, String indirizzo, String ufficio) {
        super(nominativo, genere, indirizzo);
        this.ufficio = ufficio;
    }
    public String getUfficio() {
        return ufficio;
    }
    public void setUfficio(String ufficio) {
        this.ufficio = ufficio;
    }
    @Override
    public double getIncentivo() {
        return super.getIncentivo() * 3;
    }
    @Override
    public String toString(){
        return String.format("%s - %c - %s - %.2f - %s", super.getNominativo(),super.getGenere(), super.getIndirizzo(), getIncentivo(), ufficio);
    }
}
