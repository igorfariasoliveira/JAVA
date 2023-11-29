package estruturasderepeticao;

import javax.swing.JOptionPane;

public class Testandorepeticao {
  public static void main(String[] args) {
    int carneirinhos=1;
    String

    while (carneirinhos<=10) {
      System.out.println((carneirinhos) + " carneirinhos");
      carneirinhos++;
    }
    JOptionPane.showMessageDialog(null, carneirinhos);
  }
}
