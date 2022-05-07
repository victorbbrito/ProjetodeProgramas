import java.util.ArrayList;
import java.util.Scanner;

public class CarroMain2 {
    public static void main(String[] args) {
        int sair = 0;

        ArrayList<Carro> carrosLivres = new ArrayList<Carro>();

        Scanner scan = new Scanner(System.in);
        Scanner inputNome = new Scanner(System.in);
        Scanner inputPlaca = new Scanner(System.in);
        Scanner inputModelo = new Scanner(System.in);
        Scanner inputMarca = new Scanner(System.in);

        while (sair == 0) {
            System.out.print("[1]Cadastrar Carro\n[2]Ver Cadastros\n[3]Sair\nINFORME UMA DAS OPÃ‡Ã•ES:");

            int opc = scan.nextInt();

            switch (opc) {

                case 1:
                    String nomeMotorista = new String();
                    String marcaCarro = new String();
                    String modeloCarro = new String();
                    String placaCarro = new String();

                    System.out.println("INFORME O NOME DO MOTORISTA");
                    nomeMotorista = inputNome.nextLine();
                    nomeMotorista = nomeMotorista.toUpperCase();

                    System.out.println("INFORME O NÚMERO DO DOCUMENTO DO MOTORISTA");
                    int docMotorista = scan.nextInt();

                    System.out.println("INFORME O ANO DE NASCIMENTO DO MOTORISTA");
                    int anoMotorista = scan.nextInt();

                    System.out.println("INFORME A PLACA DO CARRO");
                    placaCarro = inputPlaca.next();
                    placaCarro =placaCarro.toUpperCase();

                    System.out.println("INFORME O MODELO DO CARRO");
                    modeloCarro = inputModelo.nextLine();
                    modeloCarro = modeloCarro.toUpperCase();

                    System.out.println("INFORME A MARCA DO CARRO");
                    marcaCarro = inputMarca.nextLine();
                    marcaCarro = marcaCarro.toUpperCase();

                    Placa nova = new Placa(placaCarro, 1);
                    Proprietario dono = new Proprietario(nomeMotorista, docMotorista, anoMotorista);
                    Motor motor = new Motor(3, 1.0, 70);
                    Carro car = new Carro(marcaCarro, modeloCarro, dono, nova, motor);

                    carrosLivres.add(car);
                    
              
                    System.out.println("========================");
                    System.out.println("INFORMÇÕES ADICIONADAS");
                    System.out.println("========================");
                    break;
                case 2:
                    for (int i = 0; i != carrosLivres.size(); i++) {
                        System.out.println(carrosLivres.get(i).getDescricao());
                        System.out.println("========================");
                    }
                    break;
                case 3:
                    sair = 1;
                    break;
                default:
                    System.out.print("INFORME UMA OPÇÃO VÁLIDA !");
                    break;
            }
            
        }
        scan.close();
        inputNome.close();
        inputPlaca.close();
        inputMarca.close();
        inputModelo.close();
    }
}
