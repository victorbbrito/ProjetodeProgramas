import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class OperacoesInteiros {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		List<Integer> vetor = new ArrayList<Integer>();
		
		int pares = 0;
		int impares = 0;
		int somaTotal = 0;
		double media = 0;
		
		int entrada = scan.nextInt();

		while(entrada != -1) {
			while(entrada != -1) {
				vetor.add(entrada);
				entrada = scan.nextInt();
			}
			System.out.println(vetor.size());
			
			int maior = vetor.get(0);
			int menor = maior;
			
	        for(int i = 0; i < vetor.size(); i++){
	        	if(vetor.get(i) > maior) {
	        		maior = vetor.get(i);
	        	}
	        	if(vetor.get(i) < menor) {
	        		menor = vetor.get(i);
	        	}
	            if(vetor.get(i)%2 == 0) {
	            	pares++;
	            }else {
	            	impares++;
	            }
	            somaTotal = somaTotal + vetor.get(i);
	        }
	        media = somaTotal / (double) vetor.size();
	        System.out.println(pares);
	        System.out.println(impares);
	        System.out.println(somaTotal);
	        System.out.printf("%.2f\n", media);
	        System.out.println(maior);
	        System.out.println(menor);
	        pares = impares = somaTotal = 0;
	        media = 0;
			vetor.clear();
			entrada = scan.nextInt();
		}
		scan.close();
	}
}
