package estruturascondicionais;
import javax.swing.JOptionPane;


public class EquacaoSegundoGrau {
  public static void main(String[] args) {
    int na,nb,nc,delta;
    
    JOptionPane.showMessageDialog(null, "Escreva os valores de A, B e C da equação do segundo grau");
    na = Integer.parseInt(JOptionPane.showInputDialog("Valor de A"));
    nb = Integer.parseInt(JOptionPane.showInputDialog("Valor de B"));
    nc = Integer.parseInt(JOptionPane.showInputDialog("Valor de C"));

    delta = (nb*nb) - (4*na*nc);
    if (delta >= 0) {
      JOptionPane.showMessageDialog(null, delta+"\nExistem raizes reais");
    } else{
      JOptionPane.showMessageDialog(null, delta+"\nNão existem raizes reais");
    }
  }
}
