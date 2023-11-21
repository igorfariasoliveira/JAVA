package estruturascondicionais;

import javax.swing.JOptionPane;

public class CalcularIdade {
  public static void main(String[] args) {
    int idade, nasc;

    nasc = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
    idade = 2023-nasc;

    if (idade >= 18) {
      JOptionPane.showMessageDialog(null, "Você é maior de idade. Tem "+idade+" anos");
    }else{
      JOptionPane.showMessageDialog(null, "Você é menor de idade. Tem "+idade+" anos");
    }
  }
}
