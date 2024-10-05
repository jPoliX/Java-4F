import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera= new Scanner(System.in);
      int[] valori ={1,2,1,4,1,7,10,1};
      int numero = 0;
        System.out.println("emoinge peteĩ papapy: ");
        numero=tastiera.nextInt();
      int[] nuovo=trovaTutti(valori,numero);

        if(nuovo!=null){
            for(int i : nuovo){
                System.out.println(i);
            }
        } else System.out.println("marchetto");
    }
    public static int[] trovaTutti(int[] vettore, int numero) {
    int contatore=0;
    for(int i=0;i<vettore.length;i++){
        if(numero==vettore[i]){
            contatore++;
        }
    }
    if(contatore>0){
        int []nuovo = new int[contatore];
        contatore=0;
        for(int i=0;i< vettore.length;i++){
            if(vettore[i]==numero){
                nuovo[contatore++]=i;
            }
        }
        return nuovo;
    }
    return null;
    }
}
