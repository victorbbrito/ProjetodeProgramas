import java.util.ArrayList;
import java.util.Iterator;

public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    Ensalamento(){
        this.salas = new ArrayList<Sala>();
        this.turmas = new ArrayList<Turma>();
        this.ensalamento = new ArrayList<TurmaEmSala>();
    }

    void addSala(Sala sala){
        this.salas.add(sala);
    }

    void addTurma(Turma turma){
        this.turmas.add(turma);
    }

    Sala getSala(Turma turma){
        Iterator<TurmaEmSala> iterator = this.ensalamento.iterator();
        while(iterator.hasNext()){
            TurmaEmSala turmaEmSala = iterator.next();
            if(turmaEmSala.turma == turma){
                return turmaEmSala.sala;
            }
        }
        return null;
    }

    public ArrayList<Turma> getTurmas(Sala sala) {
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		for(int i=0; i<this.ensalamento.size();i++) {
			TurmaEmSala turmaNoEnsalamento = this.ensalamento.get(i);
			if(turmaNoEnsalamento.sala == sala){
				turmas.add(turmaNoEnsalamento.turma);
			}
		}
		if (turmas.size()>0){
			return turmas;		
		}else {
			return null;
		}
	}

    boolean salaDisponivel(Sala sala, int horario){
        Iterator<TurmaEmSala> iterator = this.ensalamento.iterator();
        while(iterator.hasNext()){
            TurmaEmSala turmaEmSala = iterator.next();
            if(turmaEmSala.sala == sala){
                if(turmaEmSala.turma.horarios.contains(horario)){
                    return false;
                }
            }
        }
        return true;
    }

    boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios){
        Iterator<Integer> iterator = horarios.iterator();
        while(iterator.hasNext()){
            Integer horarioProx = iterator.next();
            if(this.salaDisponivel(sala,horarioProx) == false){
                return false;
            }
        }
        return true;
    }

    boolean alocar(Turma turma, Sala sala){
        if(turma.acessivel != sala.acessivel){
            return false;
        }
        if(turma.numAlunos > sala.capacidade){
            return false;
        }
        else{
            TurmaEmSala nova = new TurmaEmSala(turma, sala);
            ensalamento.add(nova);
            return true;
        }
    }

    void alocarTodas(){
        Iterator<Turma> iteratorTurmas = turmas.iterator();
        Iterator<Sala> iteratorSala = salas.iterator();
        Sala sala = iteratorSala.next();

        while(iteratorTurmas.hasNext()){
            Turma turmasTurma = iteratorTurmas.next();
            if(this.salas.size() > 1){
                alocar(turmasTurma,sala);
            }
            else{
                alocar(turmasTurma,salas.get(0));
            }
            
        }
    }

    int getTotalTurmasAlocadas(){
        int total = 0;
        Iterator<TurmaEmSala> iterator = ensalamento.iterator();
        
        while(iterator.hasNext()){
            TurmaEmSala turmaEmSala = iterator.next();
            if(turmaEmSala.sala != null){
                total++;
            }
        }
        return total;
    }

    int getTotalEspacoLivre(){
        Iterator<TurmaEmSala> iterator = ensalamento.iterator();
        int total = 0;
        while(iterator.hasNext()){
            TurmaEmSala turmaEmSala = iterator.next();
            if(turmaEmSala.sala != null){
                total += turmaEmSala.sala.capacidade - turmaEmSala.turma.numAlunos; 
            }
        }
        return total;
    }

    String relatorioResumoEnsalamento(){
        return "Total de Salas: "+salas.size()+"\nTotal de Turmas: "+turmas.size()+"\nTurmas Alocadas: "+getTotalTurmasAlocadas()+"\nEspaços Livres: "+getTotalEspacoLivre();
    }

    String relatorioTurmasPorSala(){
        String resultado = this.relatorioResumoEnsalamento();
		String resultadoSala = new String();
        
		for(int i=0; i<this.salas.size(); i++){
			Sala sala = this.salas.get(i);			
			resultadoSala = "\n--- " + sala.getDescricao() + " ---\n";
			
			resultado += resultadoSala;
			
			ArrayList<Turma> turmasSala = this.getTurmas(sala);
			if(turmasSala != null){
				for(int j=0; j<turmasSala.size();j++){
					Turma turma = turmasSala.get(j);
					resultado += "\n"+turma.getDescricao()+"\n";
				}			
			}					
		}		
		return resultado;
    }

    String relatorioSalasPorTurma(){
        
		String resultadoTurma = new String();

		for(int i=0; i<this.turmas.size(); i++){
			Turma turma = this.turmas.get(i);
			Sala sala = this.getSala(turma);			
			resultadoTurma = "\n"+turma.getDescricao()+"\n";

			if(sala != null){
				resultadoTurma += "Sala: "+sala.getDescricao()+"\n";
			}else{
				resultadoTurma +="Sala: SEM SALA\n";
			}
		}		
		return relatorioResumoEnsalamento()+resultadoTurma;
    }

}
