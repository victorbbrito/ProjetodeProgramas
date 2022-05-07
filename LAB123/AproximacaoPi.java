import java.util.Scanner;
    
public class AproximacaoPi {
    public static double dividendo(double valor){
        return (valor*(valor+1)*(valor+2));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double entrada = scan.nextDouble();
        scan.close();

        double termoGeral = 3.000;
        double pi = termoGeral;

        if(entrada == 1){
            System.out.printf("%.6f\n", termoGeral);
        }
        else{
            System.out.printf("%.6f\n", termoGeral);
            entrada--;
            double contador = 2.00;
            while(entrada > 0){
                double div = dividendo(contador);
                pi = pi + (4/div);
                System.out.printf("%.6f\n", pi);
                contador = contador+2;
                entrada--;
                if(entrada > 0){
                    div = dividendo(contador);
                    pi = pi - (4/div);
                    System.out.printf("%.6f\n", pi);
                    contador = contador+2;
                    entrada--;
                }
            }
        }
    }
}
