
public class Carro {
    String marca;
    String modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;

    Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor){
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }
    String getDescricao(){
        return "Carro:"+this.marca+" / "+this.modelo+"\nPlaca:"+this.placa.placa+"\nProprietario:"+this.proprietario.nome+", Documento:"+this.proprietario.cnh+", Ano de Nascimento:"+this.proprietario.anoNascimento;
    }
}
