import java.util.ArrayList;
import java.util.Iterator;

public class SessaoJedi {
    String nome;
    TreinadorJedi treinador = new TreinadorJedi();
    ArrayList<IniciadoJedi> iniciados = new ArrayList<IniciadoJedi>();

    SessaoJedi(String nome, TreinadorJedi treinador){
        this.nome = nome;
        this.treinador = treinador;
    }
    
    
    /** 
     * @param iniciado
     */
    void addIniciado(IniciadoJedi iniciado){
        if(iniciados.contains(iniciado) == false){
            iniciados.add(iniciado);
        }
    }

    IniciadoJedi getIniciado(String nome){
        int contador = 0;
        while(contador < iniciados.size()){
            if(iniciados.get(contador).nome == nome){
                return iniciados.get(contador);
            }
            contador++;
        }
        return null;
    }

    double getMediaAnoNascimento(){
        int contador = 0;
        double media = 0;
        while(contador < iniciados.size()){
            media = media + iniciados.get(contador).anoNascimento;
            contador++;
        }
        media = media/contador;
        return media;
    }

    String getDescricao(){
        String intrucao = "--> SESSÃO "+this.nome+"(Treinador: "+treinador.getDescricao()+")\n";
        String iniciado = new String();
        Iterator<IniciadoJedi> iterator = iniciados.iterator();
        int contador = 1;
        while(iterator.hasNext()){
           iniciado += "  - Iniciado"+contador+": "+iterator.next().getDescricao()+"\n"; 
           contador++;
        }
        return intrucao + iniciado;
    }
}
