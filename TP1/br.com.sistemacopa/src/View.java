import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.JOptionPane;

public class View extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public View() {
        super();
        ImageIcon image = new ImageIcon("src/icon.png");
        this.setSize(805, 400);
        this.setIconImage(image.getImage());
        this.setTitle("Sistema Copa do Mundo 2014");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel topo = new JLabel();
        topo.setHorizontalAlignment(JLabel.CENTER);
        topo.setVerticalAlignment(JLabel.TOP);
        topo.setBounds(JLabel.CENTER, JLabel.CENTER, 805, 40);
        topo.setText("Copa do Mundo FIFA 2014");
        topo.setFont(new Font("Roboto", Font.ITALIC, 30));

        Border borda = BorderFactory.createLineBorder(new Color(0, 156, 59), 3);

        JButton jogos = new JButton("JOGOS");
        jogos.setBounds(0, 50, 150, 30);
        jogos.setBorder(borda);
        jogos.setBackground(new Color(255, 223, 0));
        jogos.setFocusable(false);
        jogos.setFont(new Font("Roboto", Font.BOLD, 15));
        jogos.setForeground(new Color(0, 39, 118));
        jogos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JogosView tela = new JogosView();
                tela.setTitle("Jogos");
                tela.setVisible(true);
            }
        });

        JButton selecoes = new JButton("SELEÇÕES");
        selecoes.setBounds(320, 50, 150, 30);
        selecoes.setBorder(borda);
        selecoes.setBackground(new Color(255, 223, 0));
        selecoes.setFocusable(false);
        selecoes.setFont(new Font("Roboto", Font.BOLD, 15));
        selecoes.setForeground(new Color(0, 39, 118));
        selecoes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SelecaoView tela = new SelecaoView();
                tela.setTitle("Seleções");
                tela.setVisible(true);
            }
        });

        JButton cidades = new JButton("CIDADES");
        cidades.setBounds(160, 50, 150, 30);
        cidades.setBorder(borda);
        cidades.setBackground(new Color(255, 223, 0));
        cidades.setFocusable(false);
        cidades.setFont(new Font("Roboto", Font.BOLD, 15));
        cidades.setForeground(new Color(0, 39, 118));
        cidades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CidadesView tela = new CidadesView();
                tela.setTitle("Locais");
                tela.setVisible(true);
            }
        });

        JButton estatisticas = new JButton("ESTATÍSTICAS");
        estatisticas.setBounds(480, 50, 150, 30);
        estatisticas.setBorder(borda);
        estatisticas.setBackground(new Color(255, 223, 0));
        estatisticas.setFocusable(false);
        estatisticas.setFont(new Font("Roboto", Font.BOLD, 15));
        estatisticas.setForeground(new Color(0, 39, 118));
        estatisticas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Atilheiros\nJames RodrÃ­guez - ColÃ´mbia  6 Gols\nThomas MÃ¼ller - Alemanha  5 Gols\n"+
                "Lionel Messi - Argentina  4 Gols\nAssistÃªncias\nJuan Cuadrado - ColÃ´mbia  4 Ass\nDaley Blind - Holanda  3 Ass\nThomas MÃ¼ller - Alemanha  3 Ass"+
                "\nCartÃµes Amarelos\nThiago Emiliano - Brasil  3 CA\nBastian Schweinsteiger - Alemanha  2 CA\nBenedikt HÃ¶wedes - Alemanha  2 CA\n"+
                "CartÃµes Vermelhos\nAlexandre Song - CamarÃµes  1 CV\nAnte RebiÄ‡ - CroÃ¡cia  1 CV\nAntonio Valencia - Equador  1 CV");
            }
        });

        JButton sobre = new JButton("SOBRE");
        sobre.setBounds(640, 50, 150, 30);
        sobre.setBorder(borda);
        sobre.setBackground(new Color(255, 223, 0));
        sobre.setFocusable(false);
        sobre.setFont(new Font("Roboto", Font.BOLD, 15));
        sobre.setForeground(new Color(0, 39, 118));
        sobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Desenvolvido por Victor Brito\nMatrÍcula 21751502\nEmai:vlbb@icomp.ufam.edu.br");
            }
        });

        JLabel foto = new JLabel();
        foto.setIcon(image);
        foto.setSize(150, 150);
        foto.setBounds(320, 150, 805, 210);

        this.add(topo);
        this.add(jogos);
        this.add(cidades);
        this.add(selecoes);
        this.add(estatisticas);
        this.add(sobre);
        this.add(foto);
    }

    public static void main(String[] args) {
        View janelinha = new View();
        janelinha.setVisible(true);
    }
}
