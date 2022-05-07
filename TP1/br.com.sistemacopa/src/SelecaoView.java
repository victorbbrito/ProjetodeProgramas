import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class SelecaoView extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6991064854359920403L;

	public SelecaoView() {
        super();
        ImageIcon image = new ImageIcon("src/icon.png");

        this.setSize(800, 600);
        this.setIconImage(image.getImage());
        SelecaoDAO paises = new SelecaoDAO();

        ArrayList<String> lista = paises.listarSelecao();

        DefaultTableModel model = new DefaultTableModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        model.addColumn("Seleção");

        for (int i = 0; i != lista.size(); i++) {
            model.addRow(new Object[] {
                    lista.get(i)
            });
        }

        JTable tabela = new JTable();

        tabela.setModel(model);
        tabela.setAutoResizeMode(0);
        tabela.setEnabled(false);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.setLayout(new FlowLayout());
        tabela.setFont(new Font("Roboto", Font.ITALIC, 15));
        this.add(tabela);
        this.setVisible(true);
    }

}
