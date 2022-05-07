import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class SelecaoDAO extends BancoDeDados{
    
    public ArrayList<String> listarSelecao(){
        ArrayList<String> listaSelecoes = new ArrayList<String>();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from fase_de_grupos");
            while (rs.next()){
                listaSelecoes.add(rs.getString(1));
            }

            rs.close();
            st.close();
    
            return listaSelecoes;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
