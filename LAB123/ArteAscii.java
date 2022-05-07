import java.util.Scanner;
class ArteAscii{
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int entrada = scan.nextInt();
    
    scan.close();
    
    int contador = entrada;

    while(entrada != 0){
        for(int i=entrada; i>0 ;i--){
            System.out.print("*");
        }
        System.out.print("\n");
            entrada = entrada - 1;
    }
 // entrada aqui finaliza com 0
 int c = 1;
    while( c < contador+1){
        for(int i=0; i<c;i++){
            System.out.print("*");  
        }
        System.out.print("\n");
        c++;
    }

    }
}

