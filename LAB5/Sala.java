public class Sala {
    int bloco;
    int sala;
    int capacidade;
    boolean acessivel;

    Sala(){
        bloco = 6;
        sala = 101;
        capacidade = 50;
        acessivel = true;
    }
    Sala(int bloco, int sala, int capacidade, boolean acessivel){
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }
    String getDescricao(){
        if(this.acessivel == false){
            return "Bloco "+this.bloco+", sala "+this.sala+" ("+this.capacidade+" lugares, não acessível)";
        }
        else
            return "Bloco "+this.bloco+", sala "+this.sala+" ("+this.capacidade+" lugares, acessível)";
    }
}
