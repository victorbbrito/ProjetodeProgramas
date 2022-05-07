public class SessaoJediMain {
    public static void main(String[] args) {
        IniciadoJedi iniciado = new IniciadoJedi("Vcitor", "Human", 22);
        TreinadorJedi treinador = new TreinadorJedi("Grão-Mestre", "Fae Coven");
        SessaoJedi primeira = new SessaoJedi("Uso da Força", treinador);
    }
}
