package br.edu.ufam.icomp.lab_excecoes;
//import br.edu.ufam.icomp.lab_excecoes.Coordenada;
//import br.edu.ufam.icomp.lab_excecoes.DistanciaEntrePontosExcedidaException;
//import br.edu.ufam.icomp.lab_excecoes.TamanhoMaximoExcedidoException;

public class Caminho {
    private Coordenada caminho[];
    private int tamanho;

    public Caminho(int maxTam){
        this.tamanho = 0;
        this.caminho = new Coordenada[maxTam];
    }
    public int tamanho(){
        return this.tamanho;
    }
    public void addCoordenada(Coordenada novaCoordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
        try{
			this.caminho[this.tamanho] = novaCoordenada;
			this.tamanho++;
		}catch(ArrayIndexOutOfBoundsException exception) {
			throw new TamanhoMaximoExcedidoException();
	    }
		if(this.tamanho > 1) {
			if (novaCoordenada.distancia(this.caminho[this.tamanho-2]) > 15) {				
				this.caminho[this.tamanho-1] = null;
				this.tamanho--;
				throw new DistanciaEntrePontosExcedidaException();
			}
		}	
    }
    public void reset(){
        this.tamanho = 0;
        this.caminho = new Coordenada[this.caminho.length];
    }

    public String toString(){
        String resultado = new String();
        if(caminho == null){
            resultado = "";
        }
        else{
            int i=0;
            while(i< this.tamanho){
                resultado += "\n   -> "+caminho[i].toString();
                i++;
            }
        }
        return "Dados do caminho:\n - Quantidade de pontos: "+this.tamanho+"\n - Pontos:"+resultado;
    }
    


}
