package estruturasderepeticao;

import javax.swing.JOptionPane;

public class EscolhendoNumeros {
  public static void main(String[] args) {
    int numb, valores, pares, impares, acima, media;

    do {
      numb = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número! Se quiser interromper aperte 0"));
      
    } while(numb!=0);
  }
}
