import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;

public class JogosDAO extends BancoDeDados{
    
    public ArrayList<Jogos> listarJogos(){
        ArrayList<Jogos> listaJogos = new ArrayList<Jogos>();
        try {
            Statement st = conexao.createStatement();
            ResultSet rs = st.executeQuery("select * from jogos");
            while (rs.next()){
                Jogos jogo = new Jogos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                rs.getString(9), rs.getString(10));
                listaJogos.add(jogo);
            }
            rs.close();
            st.close();
    
            return listaJogos;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
}
