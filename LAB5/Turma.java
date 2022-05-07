import java.util.ArrayList;

public class Turma {
    String nome;
    String professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<Integer>();

    Turma(){
        nome = "Projeto de Programas";
        professor = "Horacio";
        numAlunos = 30;
        acessivel = true;
    }
    
    Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }

    void addHorario(int hora){
        if(hora<36 || hora>0){
            horarios.add(hora);
        }
    }

    String getHorariosString(){
        String aula = new String();
        int hora = 0;
        while(hora<horarios.size()){
            switch(horarios.get(hora)){
                case 1:
                    aula += "segunda 8hs, ";
                    break;
                case 2:
                    aula += "segunda 10hs, ";
                    break;
                case 3:
                    aula += "segunda 12hs,";
                    break;
                case 4:
                    aula += "segunda 14hs, ";
                    break;
                case 5:
                    aula += "segunda 16hs, ";
                    break;
                case 6:
                    aula += "segunda 18hs, ";
                    break;
                case 7:
                    aula += "segunda 20hs, ";
                    break;
                case 8:
                    aula += "terça 8hs, ";
                    break;
                case 9:
                    aula += "terça 10hs, ";
                    break;
                case 10:
                    aula += "terça 12hs, ";
                    break;
                case 11:
                    aula += "terça 14hs, ";
                    break;
                case 12:
                    aula += "terça 16hs, ";
                    break;
                case 13:
                    aula += "terça 18hs, ";
                    break;
                case 14:
                    aula += "terça 20hs, ";
                    break;
                case 15:
                    aula += "quarta 8hs";
                    break;
                case 16:
                    aula += "quarta 10hs";
                    break;
                case 17:
                    aula += "quarta 12hs";
                    break;
                case 18:
                    aula += "quarta 14hs";
                    break;
                case 19:
                    aula += "quarta 16hs";
                    break;
                case 20:
                    aula += "quarta 18hs";
                    break;
                case 21:
                    aula += "quarta 20hs";
                    break;
                case 22:
                    aula += "quinta 8hs";
                    break;
                case 23:
                    aula += "quinta 10hs";
                    break;
                case 24:
                    aula += "quinta 12hs";
                    break;
                case 25:
                    aula += "quinta 14hs";
                    break;
                case 26:
                    aula += "quinta 16hs";
                    break;
                case 27:
                    aula += "quinta 18hs";
                    break;
                case 28:
                    aula += "quinta 20hs";
                    break;
                case 29:
                    aula += " , sexta 8hs";
                    break;
                case 30:
                    aula += " , sexta 10hs";
                    break;
                case 31:
                    aula += " , sexta 12hs";
                    break;
                case 32:
                    aula += " , sexta 14hs";
                    break;
                case 33:
                    aula += " , sexta 16hs";
                    break;
                case 34:
                    aula += " , sexta 18hs";
                    break;
                case 35:
                    aula += " , sexta 20hs";
                    break;
                default:
                    break;
            }
            hora++;
        }
        return aula;
    }

    String getDescricao(){
        if(this.acessivel == true){
           return "Turma: "+this.nome+"\nProfessor: "+this.professor+"\nNúmero de Alunos: "+this.numAlunos+"\nHorário: "+this.getHorariosString()+"\nAcessível: sim" ; 
        }
        else{
            return "Turma: "+this.nome+"\nProfessor: "+this.professor+"\nNúmero de Alunos: "+this.numAlunos+"\nHorário: "+this.getHorariosString()+"\nAcessível: não" ; 
        }
        
    }
}
