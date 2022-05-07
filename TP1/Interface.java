import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;

public class Interface extends JFrame{
    
    public Interface(){
        super();
        this.setTitle("Name"); // define o nome da janela que do programa neste caso "name";
        this.setResizable(true); // define se a janela poderá ser redimencionada
        this.setLayout(null);
        this.setSize(720, 480); // seleciona o tamanho da janela a ser criada (x = 720 , y = 480)
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // seleciona a ação que encerrar a nossa GUI, neste caso quando a janela for encerrada

        ImageIcon icon = new ImageIcon("taca-copa-mundo.png"); // criamos o logo da nossa janela
        this.setIconImage(icon.getImage()); // definimos o logo para a janela

        //this.getContentPane().setBackground(Color.YELLOW); // mudar a cor do background da janela ,  parametros setBackground -> new Color(r,g,b), Color.color_name ou new Color(color hex code)

        Border borda = BorderFactory.createLineBorder(new Color(75,80,110),5); // cria um elemento borda definimos o tipo de bordar, a cor e a espessura

        JLabel titulo = new JLabel();
        titulo.setText("Sistema de Gerenciamento Copa do Mundo"); // definir um texto
        titulo.setBounds(0, 0,720,40); // define os limites do label setBound(alinhamento_horizontal,alinhamento_vertical,tamanho_x, tamanho_y)
        titulo.setHorizontalAlignment(SwingConstants.CENTER); // definir o alinhamento horizontal deste JLabel
        titulo.setVerticalAlignment(SwingConstants.TOP); // definir o alinhamento vertical deste JLabel
        titulo.setForeground(Color.WHITE); // definir a cor do label, neste caso do Texto
        titulo.setFont(new Font("Helvetica", Font.BOLD, 20)); // definir a fonte que vai ser usada neste label, new Font ("nome da fonte", tipo de fonte, tamanho da fonte)
        // titulo.setIcon(image); definir uma imagem para estar nesse label
        // titulo.setIconTextGap(100); definir o distanciamento entre o texto e a imagem deste label
        titulo.setBackground(new Color(86,95,110)); //define o background deste label
        titulo.setOpaque(true); //define a opacidade deste background
        titulo.setBorder(borda); // aplica o elemento borda que foi definido anteriormente
        this.add(titulo);

        JButton bGer = new JButton("Exibir");
        bGer.setBounds(10, 40, 100, 25);
        this.add(bGer);

        JButton bSobre = new JButton("Sobre");
        bSobre.setBounds(110,40,100,25);
        this.add(bSobre);

        bSobre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //Interface view = new Interface();
                //view.setVisible(true);
                //JOptionPane.showMessageDialog(null, "Desenvolvido por Victor Brito - 21751502\nE-mail: vlbb@icomp.ufam.edu.br");
            }
        });
    }

    public static void main(String[] args) {
        Interface window = new Interface();

        

        window.setVisible(true);  
    }

}
