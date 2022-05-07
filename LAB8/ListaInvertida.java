import java.util.Hashtable;
import java.util.LinkedList;

public class ListaInvertida {
    private Hashtable<String, LinkedList<String>> tabela;

    public ListaInvertida(){
        tabela = new Hashtable<String, LinkedList<String>>();
    }

    public boolean insere(String palavra, String documento){
        LinkedList<String> lista = this.tabela.get(palavra);
        if(lista != null){
            if(lista.contains(documento) == false){
                lista.add(documento);
                return true;
            }
            else
                return false;
        }
        else{
            LinkedList<String> value = new LinkedList<String>();
            value.add(documento);
            tabela.put(palavra, value);
            return true;
        }
    }

    public LinkedList<String> busca(String palavra){
        return this.tabela.get(palavra);
    }

    public String toString(){
        return this.tabela.toString();
    }

}
