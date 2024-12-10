public class Scuderia {
    private String nome;
    private Pilota nPilota;
    private int nAuto, tempoGiro;

    public Scuderia(String nome, Pilota nPilota, int nAuto) {
        this.nome = nome;
        this.nPilota = nPilota;
        this.nAuto = nAuto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getnPilota() {
        return nPilota.getNome();
    }
    public void setnPilota(Pilota nPilota) {
        this.nPilota = nPilota;
    }

    public int getnAuto() {
        return nAuto;
    }

    public void setnAuto(int nAuto) {
        this.nAuto = nAuto;
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    public void setTempoGiro(int tempoGiro) {
        this.tempoGiro = tempoGiro;
    }
}
