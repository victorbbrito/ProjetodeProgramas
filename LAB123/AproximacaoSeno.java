import java.util.Scanner;

public class AproximacaoSeno {
    public static double fatorial(int valor){
        double resultado = 1;
        int contador = 1;
        while(contador != valor+1){
            resultado = resultado * contador;
            contador++;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double graus = scan.nextDouble();
        int kNumeros = scan.nextInt();
        scan.close();

        double casoBase = Math.toRadians(graus);
        double seno = casoBase;
        int expoente = 3;

        System.out.printf("%.10f\n",seno);
        kNumeros--;
        while(kNumeros > 0){
            seno = seno - (Math.pow(casoBase, expoente)/fatorial(expoente));
            System.out.printf("%.10f\n",seno);
            expoente = expoente+2;
            kNumeros--;
            if(kNumeros > 0){
                seno = seno + (Math.pow(casoBase, expoente)/fatorial(expoente));
                expoente = expoente+2;
                System.out.printf("%.10f\n",seno);
                kNumeros--;
            }
        }
    }
}
