public class Computer {
    private String processore;
    private int memoriaRAM;
    private int memoriaDiMassa;
    private String marca;
    private String modello;
    private String sistemaOperativo;

    public Computer(String processore, int memoriaRAM, int memoriaDiMassa, String marca, String modello, String sistemaOperativo) {
        this.processore = processore;
        this.memoriaRAM = memoriaRAM;
        this.memoriaDiMassa = memoriaDiMassa;
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getProcessore() {
        return processore;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getMemoriaDiMassa() {
        return memoriaDiMassa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public void setMemoriaDiMassa(int memoriaDiMassa) {
        this.memoriaDiMassa = memoriaDiMassa;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public String toString() {
        return String.format("Processore: %s Memoria RAM: %d Memoria Di Massa: %d Marca: %s Modello: %s Sistema Operativo: %s", processore, memoriaRAM, memoriaDiMassa, marca, modello, sistemaOperativo);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Computer) {
            return this.marca.equals(((Computer) o).marca) && this.modello.equals(((Computer) o).modello);
        }
        return false;
    }
}
