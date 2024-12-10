import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime, endTime;
    private int tempoGiro;
    public Cronometro() {
        setStartTime();
        setEndTime();
    }
    public void setStartTime(){
        startTime = LocalTime.now();
    }
    public void setEndTime(){
        endTime = LocalTime.now();
    }

    public int getTempoGiro() {
        return tempoGiro;
    }
    public void resetTimer(){
        setStartTime();
        setEndTime();
    }

    public void calcolaIntTimer() throws Exception{
        int tempoGiro;
        tempoGiro = this.endTime.toSecondOfDay() - this.startTime.toSecondOfDay();
        if(tempoGiro == 0){
            throw new Exception("Il cronometro è fermo");
        }
        this.tempoGiro = tempoGiro;

    }
    @Override
    public String toString(){
        return String.format("TEMPO: %d", tempoGiro);
    }
}
