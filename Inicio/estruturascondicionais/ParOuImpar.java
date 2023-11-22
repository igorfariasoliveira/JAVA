package estruturascondicionais;

import javax.swing.JOptionPane;

public class ParOuImpar {
  public static void main(String[] args) {
    int n1,res;

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número!"));
    res = n1%2;
    if (res == 0) {
      JOptionPane.showMessageDialog(null, "O número é par");
    }else{
      JOptionPane.showMessageDialog(null, "O número é impar");  
    }
    
  }
}
