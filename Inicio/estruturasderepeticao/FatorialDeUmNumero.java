package estruturasderepeticao;

import javax.swing.JOptionPane;

public class FatorialDeUmNumero {
  public static void main(String[] args) {
    int n= Integer.parseInt(JOptionPane.showInputDialog("Escolha um número para fatorar"));
    int f = 1;
    int c = n;

    while (c>=1) {
      f *= c;
      c--;
    }

    JOptionPane.showMessageDialog(null, f);
  }
}
