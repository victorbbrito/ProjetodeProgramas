public class Placa {
    String placa;
    int tipo;

    Placa(){
        placa = "OAT-3966";
        tipo = 6;
    }
    Placa(String placa, int tipo){
        this.placa = placa;
        this.tipo = tipo;
    }
    String getTipoString(){
        switch(tipo){
            case 1:
            return "Normal";
            
            case 2:
            return "Servico";
            
            case 3:
            return "Oficial";
            
            case 4:
            return "Auto Escola";
            
            case 5:
            return "Prototipo";
            
            case 6:
            return "Colecionador";
        
            default:
            return "Outros";
        }
    }
    boolean temEstacionamentoLivre(){
        switch(tipo){
            case 2:
            return true;
            case 3:
            return true;
            default:
            return false;
        }
    }
    String getDescricao(){
        return "Placa: placa="+this.placa+", tipo="+getTipoString()+", estacionamentoLivre="+temEstacionamentoLivre()+".";
    }
}
