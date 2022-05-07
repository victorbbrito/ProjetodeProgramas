public class TreinadorJedi {
    String titulacao;
    String nome;

    TreinadorJedi(){
        titulacao = "Grão-Mestre";
        nome = "Fae Coven";
    }
    TreinadorJedi(String titulacao, String nome){
        this.titulacao = titulacao;
        this.nome = nome;
    }
    String getDescricao(){
        return this.titulacao+" "+this.nome;
    }
}
