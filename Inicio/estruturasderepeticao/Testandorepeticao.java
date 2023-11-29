package estruturasderepeticao;

import javax.swing.JOptionPane;

public class Testandorepeticao {
  public static void main(String[] args) {
    int carneirinhos=1;
    String contador = "";

    while (carneirinhos<=10) {
      contador += carneirinhos + "";
      carneirinhos++;
    }
    JOptionPane.showMessageDialog(null, contador);
  }
}
