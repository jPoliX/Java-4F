public class Punto {
    private int puntoX;
    private int puntoY;

    /*public void Punto(){              // costruttore
        this.puntoX = 10;
        this.puntoY = 10;
    }
    public Punto(int x, int y){
        this.puntoY = y;
        this.puntoX = x;
    }*/
    public void setPuntoX(int puntoX) throws Exception{
        try {
            this.puntoX = puntoX;           // this serve per puntare la variabile e assegnarli il parametro
        }catch (Exception e){
            throw new Exception();
        }
    }
    public int getPuntoX(){
        return puntoX;
    }
    public void setPuntoY(int puntoY){
        this.puntoY = puntoY;
    }
    public int getPuntoY(){
        return puntoY;
    }

    public String trovaQuadranti(){
        if(puntoX>0 && puntoY>0)
            return "1 Quadrante";
        else if(puntoX>0 && puntoY<0)
            return "4 Quadrante";
        else if(puntoX<0 && puntoY>0)
            return "2 Quadrante";
        else if(puntoX<0 && puntoY<0)
            return "3 Quadrante";
        else if(puntoX==0 && puntoY==0)
            return "il punto è l'origine";
        return "Il punto si trova negli assi";
    }
    @Override
    public String toString(){
        return "X = " + puntoX + ", Y = " + puntoY;
    }
}
