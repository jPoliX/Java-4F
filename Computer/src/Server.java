public class Server extends Computer {
    private int nProcessori;
    private boolean raid;

    public Server(String processore, int memoriaRAM, int memoriaDiMassa, String marca, String modello, String sistemaOperativo, int nProcessori, boolean RAID) {
        super(processore, memoriaRAM, memoriaDiMassa, marca, modello, sistemaOperativo);
        this.nProcessori = nProcessori;
        this.raid = RAID;
    }

    public int getnProcessori() {
        return nProcessori;
    }

    public void setnProcessori(int nProcessori) {
        this.nProcessori = nProcessori;
    }

    public boolean isRaid() {
        return raid;
    }

    public void setRaid(boolean raid) {
        this.raid = raid;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "Numero Processori: %d Raid: %s", nProcessori, raid);
    }
}
