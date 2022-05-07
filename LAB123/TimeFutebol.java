import java.util.Scanner;

public class TimeFutebol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada = scan.nextInt();

        int vetorTime[] = new int[1000];
        int vetorAdversario[] = new int[1000];

        int contador = 0;
        while(entrada > 0){
            vetorTime[contador] = entrada;
            entrada = scan.nextInt();
            contador++;
        }

        contador = 0;

        int entradaAdversario;
        entradaAdversario = scan.nextInt();
        while(entradaAdversario > 0){
            vetorAdversario[contador] = entradaAdversario;
            entradaAdversario = scan.nextInt();
            contador++;
        }

        int vitorias = 0;
        int empates = 0;
        int derrotas = 0;
    
        for(int i = 0; i < contador; i++){
            if(vetorTime[i] < vetorAdversario[i]){
                vitorias++;
            }
        }
        for(int i = 0; i < contador; i++){
            if(vetorTime[i] == vetorAdversario[i]){
                empates++;
            }
        }
        for(int i = 0; i < contador; i++){
            if(vetorTime[i] < vetorAdversario[i]){
                derrotas++;
            }
        }
        scan.close();
        System.out.print(vitorias);
        System.out.print(" "+empates);
        System.out.print(" "+derrotas);


    }    
}
