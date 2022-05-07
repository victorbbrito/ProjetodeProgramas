import java.util.Scanner;

public class DataExtenso {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int data = scan.nextInt();

        scan.close();

        double ano = 0;
        int dia = 0;
        int mes = 0;

        ano = data;
        dia = (int)data/1000000;
        ano = ano/10000;
        mes = (int)ano - dia*100;
        int aux_ano = (int)ano;
        ano = ano - aux_ano;
        ano = ano * 10000;
        aux_ano = (int) ano;
        
        if(mes>=1 && mes <13){
            if(mes == 1){
                System.out.println(dia+" de janeiro de "+aux_ano);
            }
            if(mes == 2){
                System.out.println(dia+" de fevereiro de "+aux_ano);
            }
            if(mes == 3){
                System.out.println(dia+" de março de "+aux_ano);
            }
            if(mes == 4){
                System.out.println(dia+" de abril de "+aux_ano);
            }
            if(mes == 5){
                System.out.println(dia+"de maio de "+aux_ano);
            }
            if(mes == 6){
                System.out.println(dia+" de junho de "+aux_ano);
            }
            if(mes == 7){
                System.out.println(dia+" de julho de "+aux_ano);
            }
            if(mes == 8){
                System.out.println(dia+" de agosto de "+aux_ano);
            }
            if(mes == 9){
                System.out.println(dia+" de setembro de "+aux_ano);
            }
            if(mes == 10){
                System.out.println(dia+" de outubro de "+aux_ano);
            }
            if(mes == 11){
                System.out.println(dia+" de novembro de "+aux_ano);
            }
            if(mes == 12){
                System.out.println(dia+" de dezembro de "+aux_ano);
            }
        }
    }
}
