package br.edu.ufam.icomp.lab_excecoes;
import java.io.FileNotFoundException;

import br.edu.ufam.icomp.lab_excecoes.RoverCaminhoException;

public class DistanciaEntrePontosExcedidaException extends RoverCaminhoException{
    public DistanciaEntrePontosExcedidaException(){
        this("Distância máxima entre duas coordenadas vizinhas excedida");
    }
    public DistanciaEntrePontosExcedidaException(String mensagem){
        super(mensagem);
    }
}
