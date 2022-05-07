public class Proprietario {
    String nome;
    int cnh;    
    int anoNascimento;

    Proprietario(){
        nome = "Emmett L. Brown";
        cnh = 98008173;
        anoNascimento = 1920;
    }
    Proprietario(String name, int cnh, int year){
        this.nome = name;
        this.cnh = cnh;
        this.anoNascimento = year;
    }
    int getIdade(int ano){
        return (ano-anoNascimento);
    }
    String getDescricao(){
        return "Proprietario: nome="+this.nome+", cnh="+this.cnh+", anoNascimento="+this.anoNascimento+".";
    }
}
