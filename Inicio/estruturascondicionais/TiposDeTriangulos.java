package estruturascondicionais;

import javax.swing.JOptionPane;

public class TiposDeTriangulos {
  public static void main(String[] args) {
    int ladoa,ladob,ladoc;

    ladoa = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado A do triângulo"));
    ladob = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado B do triângulo"));
    ladoc = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado C do triângulo"));

    if (ladoa == ladob && ladob==ladoc) {
      JOptionPane.showMessageDialog(null, "É um triângulo equilatero");
    }else if ((ladoa == ladob && ladob != ladoc ) || (ladob == ladoc && ladob != ladoa) ||) {
      
    }
  }
}
