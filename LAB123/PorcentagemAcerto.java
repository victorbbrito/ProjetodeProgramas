import java.util.Scanner;

public class PorcentagemAcerto {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        

        int vetor1[] = new int[1000];
        int vetor2[] = new int[1000];
        
        int i1 = 0;
        while(entrada > 0){
            vetor1[i1] = entrada;
            entrada = scan.nextInt();
            i1++;
        }

        int i2 = 0;
        int entrada2 = scan.nextInt();
        while(entrada2 > 0){
            vetor2[i2] = entrada2;
            entrada2 = scan.nextInt();
            i2++;
        }
        
        double acertos = 0;

        while(i2>0){
            if(vetor2[i2] == vetor1[i2]){
                acertos++;
            }
            i2--;
        }

        double porcentagem;
        porcentagem = ((acertos/i1)*100);

        System.out.printf("%.2f", porcentagem);
        scan.close();

    }
}
