public class Portatili extends Computer {
    private double peso;
    private int dimDesktop;
    private int altezza, larghezza, profondita;

    public Portatili(String processore, int memoriaRAM, int memoriaDiMassa, String marca, String modello, String sistemaOperativo, double peso, int dimDesktop, int altezza, int larghezza, int profondita) {
        super(processore, memoriaRAM, memoriaDiMassa, marca, modello, sistemaOperativo);
        this.peso = peso;
        this.dimDesktop = dimDesktop;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondita = profondita;
    }

    public double getPeso() {
        return peso;
    }

    public int getDimDesktop() {
        return dimDesktop;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getProfondita() {
        return profondita;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDimDesktop(int dimDesktop) {
        this.dimDesktop = dimDesktop;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Peso: %.2f Dimensioni Desktop: %d pollici Altezza: %d Larghezza: %d Profondità: %d", peso, dimDesktop, altezza, larghezza, profondita);
    }

}
