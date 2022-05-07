import java.sql.*;

public class BancoDeDados {
    private static String url = "jdbc:mysql:loc//localhost:3306/CitacoesBD";
    private static String user = "citacoes_admin";
    private static String pass = "Teste123";
    protected static Connection conexao = null;
    
    public BancoDeDados(){
        if(conexao == null) conecta();
    }

    private static boolean conecta(){
        try{
            conexao = DriverManager.getConnection(url, user, pass);
            return true;
        } catch (SQLException e ) {return false;}
    }

    public static boolean desconecta(){
        try{
            conexao.close();
            return true;
        } catch (SQLException e) {return false;}
    }
}
