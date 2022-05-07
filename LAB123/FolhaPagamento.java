import java.util.Scanner;
public class FolhaPagamento {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float valor = scan.nextFloat();
        int hora = scan.nextInt();

        scan.close();

        float salario = (float)hora*valor;
        double ir = salario*0.11;
        double inss = salario*0.08;
        double descontos = ir + inss;
        double salarioLiquido = salario - descontos;

        System.out.printf("Salario bruto: R$%.2f\n",salario);
        System.out.printf("IR: R$%.2f\n",ir);
        System.out.printf("INSS: R$%.2f\n",inss);
        System.out.printf("Total de descontos: R$%.2f\n",descontos);
        System.out.printf("Salario liquido: R$%.2f",salarioLiquido);
    }
}
