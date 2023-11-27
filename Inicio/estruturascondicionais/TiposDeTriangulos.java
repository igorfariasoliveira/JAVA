package estruturascondicionais;

import javax.swing.JOptionPane;

public class TiposDeTriangulos {
  public static void main(String[] args) {
    int ladoa,ladob,ladoc;

    ladoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A do triangulo"));
    ladob = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B do triangulo"));
    ladoc = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C do triangulo"));

    if (ladoa == ladob && ladob==ladoc) {
      JOptionPane.showMessageDialog(null, "É um triângulo ");
    }
  }
}
