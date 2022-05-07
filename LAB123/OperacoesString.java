import java.util.Scanner;

public class OperacoesString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String palavra = scan.nextLine();
        scan.close();

        int quantidadeCaracteres = palavra.length();
        String primeiroCaractere = palavra.substring(0, 1);
        String ultimoCaractere = palavra.substring(quantidadeCaracteres-1);
        String tudoMaiusculo = palavra.toUpperCase();
        String tudoMinusculo = palavra.toLowerCase();
        String aPorE = palavra.replace('a', 'e');
        String indicePar = new String();
        int quantidadeVogais = 0;
        
        
        System.out.println(quantidadeCaracteres);
        System.out.println(primeiroCaractere);
        System.out.println(ultimoCaractere);
        System.out.println(tudoMaiusculo);
        System.out.println(tudoMinusculo);
        System.out.println(aPorE);
        
        int contador = 0;
        while(contador < quantidadeCaracteres){ 
            if(contador%2 == 0){
                char c = palavra.charAt(contador);
                indicePar = String.valueOf(c);
                System.out.print(indicePar);
            }
            contador++;
        }
        
        contador = 0;
        while(contador != quantidadeCaracteres){ 
            
            if(palavra.charAt(contador) == 'a'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'A'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'e'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'E'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'i'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'I'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'o'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'O'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'u'){
                quantidadeVogais++;
            }
            if(palavra.charAt(contador) == 'U'){
                quantidadeVogais++;
            }
            contador++;
        }

        System.out.println("\n"+quantidadeVogais);

    }
}
