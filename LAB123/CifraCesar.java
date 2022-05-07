import java.util.Scanner;

public class CifraCesar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String textoOriginal = scan.nextLine();
        String textoCifrado = new String();
        int quantidadeCaracteres = textoOriginal.length();

        int contador = 0;
        while(contador < quantidadeCaracteres){
            textoCifrado = textoOriginal.replace('a','E');
            textoCifrado = textoCifrado.replace('b','F');
            textoCifrado = textoCifrado.replace('c','G');
            textoCifrado = textoCifrado.replace('d','H');
            textoCifrado = textoCifrado.replace('e','I');
            textoCifrado = textoCifrado.replace('f','J');
            textoCifrado = textoCifrado.replace('g','K');
            textoCifrado = textoCifrado.replace('h','L');
            textoCifrado = textoCifrado.replace('i','M');
            textoCifrado = textoCifrado.replace('j','N');
            textoCifrado = textoCifrado.replace('k','O');
            textoCifrado = textoCifrado.replace('l','P');
            textoCifrado = textoCifrado.replace('m','Q');
            textoCifrado = textoCifrado.replace('n','R');
            textoCifrado = textoCifrado.replace('o','S');
            textoCifrado = textoCifrado.replace('p','T');
            textoCifrado = textoCifrado.replace('q','U');
            textoCifrado = textoCifrado.replace('r','V');
            textoCifrado = textoCifrado.replace('s','W');
            textoCifrado = textoCifrado.replace('t','X');
            textoCifrado = textoCifrado.replace('u','Y');
            textoCifrado = textoCifrado.replace('v','Z');
            textoCifrado = textoCifrado.replace('w','A');
            textoCifrado = textoCifrado.replace('x','B');
            textoCifrado = textoCifrado.replace('y','C');
            textoCifrado = textoCifrado.replace('z','D');
            
            contador++;
        }
        scan.close();
        System.out.println(textoCifrado);
    }
}
