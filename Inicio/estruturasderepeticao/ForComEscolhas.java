package estruturasderepeticao;

import javax.swing.JOptionPane;

public class ForComEscolhas {
  public static void main(String[] args) {
    int inicio, fim, passo;
    String result="";

    inicio = Integer.parseInt(JOptionPane.showInputDialog("Escolha o inicio"));
    fim= Integer.parseInt(JOptionPane.showInputDialog("Escolha o fim"));
    passo = Integer.parseInt(JOptionPane.showInputDialog("Escolha a quantidade de numeros que ira pular as casas"));

    for(int c=inicio;c<=fim;c+=passo){
      result+=c+"\n";
    };
    
    JOptionPane.showMessageDialog(null, result);
  }
}
