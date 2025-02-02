public class Fissi extends Computer {
    private Contenitore contenitore;
    private String schedaVideo;
    private Tipo tipo;

    public Fissi(String processore, int memoriaRAM, int memoriaDiMassa, String marca, String modello, String sistemaOperativo, Contenitore contenitore, String schedaVideo, Tipo tipo) {
        super(processore, memoriaRAM, memoriaDiMassa, marca, modello, sistemaOperativo);
        this.contenitore = contenitore;
        this.schedaVideo = schedaVideo;
        this.tipo = tipo;
    }

    public Contenitore getContenitore() {
        return contenitore;
    }

    public String getSchedaVideo() {
        return schedaVideo;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " Tipo: %s Scheda Video: %s Tipo: %s", contenitore, schedaVideo, tipo);
    }
    @Override
    public boolean equals(Object o){
        if(o instanceof Fissi){
            return super.equals(o) && this.schedaVideo.equals(((Fissi)o).schedaVideo);
        } else
            return false;
    }
}