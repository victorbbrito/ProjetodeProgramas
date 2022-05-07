package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

import br.edu.ufam.icomp.lab_excecoes.RoverCaminhoException;

public class TamanhoMaximoExcedidoException extends RoverCaminhoException{
    public TamanhoMaximoExcedidoException(){
        this("Quantidade máxima de coordenadas excedida");
    }
    public TamanhoMaximoExcedidoException(String mensagem){
        super(mensagem);
    }
}
