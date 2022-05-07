import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class JogosView extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 961807345011611468L;

	public JogosView() {
        super();
        ImageIcon image = new ImageIcon("src/icon.png");
        this.setSize(800, 600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setIconImage(image.getImage());
        JogosDAO jogos = new JogosDAO();

        ArrayList<Jogos> listaJogos = jogos.listarJogos();

        DefaultTableModel model = new DefaultTableModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        model.addColumn("Seleções");
        model.addColumn("Data");
        model.addColumn("Estado");
        model.addColumn("Cidade");
        model.addColumn("Estádio");
        model.addColumn("Placar");
        model.addColumn("Penalti");
        model.addColumn("Fase da Competição");
        model.addColumn("Resultado");

        for (int i = 0; i != listaJogos.size(); i++) {
            model.addRow(new Object[] {
                    listaJogos.get(i).getSelecao(),
                    listaJogos.get(i).getData(),
                    listaJogos.get(i).getEstado(),
                    listaJogos.get(i).getCidade(),
                    listaJogos.get(i).getEstadio(),
                    listaJogos.get(i).getPlacar(),
                    listaJogos.get(i).getPenalti(),
                    listaJogos.get(i).getTipo(),
                    listaJogos.get(i).getResultado()
            });
        }
        JTable tabela = new JTable();

        tabela.setModel(model);
        tabela.setAutoResizeMode(0);
        tabela.setEnabled(false);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(200);// seleções
        tabela.getColumnModel().getColumn(1).setPreferredWidth(80);// data
        tabela.getColumnModel().getColumn(2).setPreferredWidth(150);// estado
        tabela.getColumnModel().getColumn(3).setPreferredWidth(200);// cidade
        tabela.getColumnModel().getColumn(4).setPreferredWidth(500);// estádio
        tabela.getColumnModel().getColumn(5).setPreferredWidth(50);// placar
        tabela.getColumnModel().getColumn(6).setPreferredWidth(50);// penaltis
        tabela.getColumnModel().getColumn(7).setPreferredWidth(150);// fase da competição
        tabela.getColumnModel().getColumn(8).setPreferredWidth(150);// resultado
        tabela.setFont(new Font("Roboto", Font.ITALIC, 15));

        JScrollPane pane = new JScrollPane(tabela);
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.getContentPane().add(pane);
        this.setVisible(true);
    }
}
