import java.util.Scanner;

public class TanqueCombustivel{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double raio = scan.nextInt();
        double x = scan.nextInt();
        int opc = scan.nextInt();

        scan.close();
        double pi = 3.14159265359;
        double vol_calota = (( pi/3 * Math.pow(x, 2)) * (3*raio - x));
        double vol_esfera = ((1.333333333333 * pi )* Math.pow(raio, 3));

        if(opc == 1){
            System.out.printf("%.4f",vol_calota);
        }
        if(opc == 2 ){
            double vol_combust = vol_esfera - vol_calota;
            System.out.printf("%.4f",vol_combust);
        }
        else{
            return ;
        }
    }
}