import java.util.Scanner;

public class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int alturaTanque = scan.nextInt();
        int alturaCombustivel = scan.nextInt();
        int raio = scan.nextInt();
        scan.close();

        double pi =Math.PI;

        double volumeEsfera = (4.00/3.00)*pi*Math.pow(raio, 3);
        double volumeCilindro = pi*Math.pow(raio, 2)*(alturaCombustivel - raio);
        double volumeCombustivel;
        if(alturaTanque < 0){
            System.out.println("-1.000");
        }
        else{
            if(alturaCombustivel > raio){
                volumeCombustivel = (volumeEsfera/2) + volumeCilindro;
            }
            else
                volumeCombustivel = pi/3 * Math.pow(alturaCombustivel, 2)*(3*raio - alturaCombustivel);

            System.out.printf("%.3f",volumeCombustivel);
        }
    }    
}
