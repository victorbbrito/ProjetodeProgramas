import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class CidadesDAO extends BancoDeDados{
    
    public ArrayList<Cidades> listarLocais(){
        ArrayList<Cidades> listaLocais = new ArrayList<Cidades>();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from locais");
            while (rs.next()){
                Cidades local = new Cidades(rs.getString(1),rs.getString(2),rs.getString(3));
                listaLocais.add(local);
            }

            rs.close();
            st.close();
    
            return listaLocais;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public ArrayList<String> listarEstado(){
        ArrayList<String> listaEstados = new ArrayList<String>();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from locais");
            while (rs.next()){
                listaEstados.add(rs.getString(1));
            }
            rs.close();
            st.close();

            return listaEstados;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    public ArrayList<String> listarCidade(){
        ArrayList<String> listaCidades = new ArrayList<String>();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from locais");
            while (rs.next()){
                listaCidades.add(rs.getString(2));
            }
            rs.close();
            st.close();
            
            return listaCidades;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
        
    }

}
