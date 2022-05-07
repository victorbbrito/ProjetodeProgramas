import javax.swing.JFrame;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class CidadesView extends JFrame {

    public void cidades(){
        JFrame view = new JFrame();
        view.setTitle("Cidades");
        view.setSize(800, 600);

        CidadesDAO locais = new CidadesDAO();

        ArrayList<String> lista = locais.listarCidade();

        DefaultTableModel model = new DefaultTableModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        model.addColumn("Cidades");

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
        view.add(tabela);
        view.setVisible(true);
    }

    public void estados(){
        JFrame view = new JFrame();
        view.setTitle("Estados");
        view.setSize(800, 600);
        
        CidadesDAO locais = new CidadesDAO();

        ArrayList<String> lista = locais.listarEstado();

        DefaultTableModel model = new DefaultTableModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        model.addColumn("Estados");

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
        view.add(tabela);
        view.setVisible(true);
    }

    public void estadios(){
        JFrame view = new JFrame();
        view.setTitle("Estados");
        view.setSize(800, 600);
        
        CidadesDAO locais = new CidadesDAO();

        ArrayList<Cidades> lista = locais.listarLocais();

        DefaultTableModel model = new DefaultTableModel();
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        model.addColumn("Estados");
        model.addColumn("Cidades");
        model.addColumn("Estadios");
        for (int i = 0; i != lista.size(); i++) {
            model.addRow(new Object[] {
            lista.get(i).getEstado(),
            lista.get(i).getCidade(),
            lista.get(i).getEstadio()
            
            });
        }

        JTable tabela = new JTable();

        tabela.setModel(model);
        tabela.setAutoResizeMode(0);
        tabela.setEnabled(false);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabela.setLayout(new FlowLayout());
        tabela.setFont(new Font("Roboto", Font.ITALIC, 15));
        view.add(tabela);
        view.setVisible(true);
    }

    public CidadesView() {
        super();
        ImageIcon image = new ImageIcon("src/icon.png");
        Border borda = BorderFactory.createLineBorder(new Color(0, 156, 59), 3);
        this.setLayout(new FlowLayout());
        this.setSize(200,200);
        this.setIconImage(image.getImage());

        JButton cidades = new JButton("Cidades");
        cidades.setBounds(200, 50, 150, 30);
        cidades.setBorder(borda);
        cidades.setBackground(new Color(255, 223, 0));
        cidades.setFocusable(false);
        cidades.setFont(new Font("Roboto", Font.BOLD, 15));
        cidades.setForeground(new Color(0, 39, 118));
        cidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cidades();
            }
        });

        JButton estados = new JButton("Estados");
        estados.setBounds(200, 50, 150, 30);
        estados.setBorder(borda);
        estados.setBackground(new Color(255, 223, 0));
        estados.setFocusable(false);
        estados.setFont(new Font("Roboto", Font.BOLD, 15));
        estados.setForeground(new Color(0, 39, 118));
        estados.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estados();
            }
        });

        JButton estadios = new JButton("Estadios");
        estadios.setBounds(200, 50, 150, 30);
        estadios.setBorder(borda);
        estadios.setBackground(new Color(255, 223, 0));
        estadios.setFocusable(false);
        estadios.setFont(new Font("Roboto", Font.BOLD, 15));
        estadios.setForeground(new Color(0, 39, 118));
        estadios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                estadios();
            }
        });

        this.add(cidades);
        this.add(estados);
        this.add(estadios);

    }
}
