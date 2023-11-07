import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBoasVindas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Boas-Vindas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        JPanel panel = new JPanel();
        frame.add(panel);

        JButton botao = new JButton("Clique aqui");
        panel.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Bem-vindo!");
            }
        });

        frame.setVisible(true);
    }
}
