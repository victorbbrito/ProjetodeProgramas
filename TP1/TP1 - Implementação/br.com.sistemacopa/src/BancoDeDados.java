import java.sql.*;
import java.sql.Connection;

import javax.swing.JOptionPane;

public class BancoDeDados {
    private static String url = "jdbc:mysql://localhost:3306/copa_do_mundo";
    private static String pass = "swqazxcde";
    private static String user = "root";
    protected static Connection conexao = null;

    public BancoDeDados() {
        if (conexao == null) {
            conecta();
        }
    }

    private static boolean conecta() {
        try {
            conexao = DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conectado ao Banco de Dados");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

    public static boolean desconecta() {
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Desconectado");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }

}
