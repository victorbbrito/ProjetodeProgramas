public class Personagem {
    private int id;
    private String apelido;
    private String nome;
    private String filme;
    private Citacao[] citacoes;

    public Personagem(String apelido, String nome, String filme) {
        this.apelido = apelido;
        this.nome = nome;
        this.filme = filme;
    }

    public void setId(int numero){
        this.id = numero;
    }

    public int getId(){
        return this.id;
    }

    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    public String getApelido(){
        return this.apelido;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setFilme(String filme){
        this.filme = filme;
    }

    public String getFilme(){
        return this.filme;
    }

    public String toString(){
    return "ID:"+this.id+"Apelido:"+this.apelido+"Nome:"+this.nome+"Filme:"+this.filme+"Citações:";
    }
}
