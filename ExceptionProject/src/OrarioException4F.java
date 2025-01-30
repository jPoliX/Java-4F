public class OrarioException4F extends Exception{
    private String message = "Problema con l'orario";
    private int h, m, s;

    public OrarioException4F(int h, int m, int s){

    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public String getMessage(){
        return message;
    }
}
