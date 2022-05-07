import java.lang.reflect.Array;
import java.util.ArrayList;

public class SessaoJedi {
    String nome;
    TreinadorJedi treinador = new TreinadorJedi();
    ArrayList<IniciadoJedi> iniciados = new IniciadoJedi();

    SessaoJedi(String nome, TreinadorJedi treinador){
        this.nome = nome;
        this.treinador = treinador;
    }
    void addIniciado(IniciadoJedi iniciado){
        
    }
}
