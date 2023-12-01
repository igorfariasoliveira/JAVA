package estruturasderepeticao;

import javax.swing.JOptionPane;

public class FatorialDeUmNumero {
  public static void main(String[] args) {
    int n= Integer.parseInt(JOptionPane.showInputDialog("Escolha um número para fatorar"));
    int f = 1;
    int c = n;
    String expressaoFatorial = n + "! = ";

    while (c>=1) {
      f *= c;
      expressaoFatorial += c;
      if (c > 1) {
        expressaoFatorial += " * ";
      }
      c--;
    }

    JOptionPane.showMessageDialog(null, expressaoFatorial + " = " + f);
  }
}
