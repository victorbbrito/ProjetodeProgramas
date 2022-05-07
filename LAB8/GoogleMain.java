public class GoogleMain {
    public static void main(String[] args) {
        ListaInvertida lista = new ListaInvertida();
        
        lista.insere("compras", "sal");
        lista.insere("compras", "salame");
        lista.insere("compras", "banana");
        lista.insere("compras", "salgado");
        lista.insere("compras", "sabonete");
        lista.busca("compras");
        System.out.println(lista.toString());
    }
}
