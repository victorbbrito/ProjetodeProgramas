import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();
        int vetor[] = new int [1000];
        int contador = 0;
        while(entrada != -1){   
            vetor[contador] = entrada;
            entrada = scan.nextInt();
            contador++;
        }
        for(int i=0; i!= contador; i++){
            if(vetor[i]%2 == 0){
                System.out.println("PAR");
            }
            else{
                System.out.println("IMPAR");
            }
        }
        scan.close();
    }
}
