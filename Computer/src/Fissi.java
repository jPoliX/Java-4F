public class Fissi extends Computer {
    private Contenitore contenitore;
    private String schedaVideo;

    public Fissi(String processore, int memoriaRAM, int memoriaDiMassa, String marca, String modello, String sistemaOperativo, Contenitore contenitore, String schedaVideo) {
        super(processore, memoriaRAM, memoriaDiMassa, marca, modello, sistemaOperativo);
        this.contenitore = contenitore;
        this.schedaVideo = schedaVideo;
    }

    public Contenitore getContenitore() {
        return contenitore;
    }

    public String getSchedaVideo() {
        return schedaVideo;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Tipo: %s Scheda Video: %s", contenitore, schedaVideo);
    }
}
