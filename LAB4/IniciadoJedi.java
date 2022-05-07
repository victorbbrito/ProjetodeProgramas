public class IniciadoJedi{
    String nome;
    String especie;
    int anoNascimento;

    IniciadoJedi(){
        nome = "Victor Lucas Bonfim";
        especie = "Tholothian";
        anoNascimento = 23;
    }

    IniciadoJedi(String nome, String especie, int anoNascimento){
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    String getDescricao(){
        return this.nome+" (especie="+this.especie+", nascimento="+this.getAnoNascimento()+")";
    }
    
    String getAnoNascimento() {
        String ano;
        int conta = 0 - this.anoNascimento;
        ano = String.valueOf(conta);
        if(conta < 0 ){
            ano = String.valueOf(conta * -1);
            ano = ano + " DBY";
        }
        else{
            ano = ano + " ABY";
        }
        
        return ano;
    }
}