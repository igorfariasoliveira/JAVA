package Vetores;

import javax.swing.JOptionPane;

public class IncrementoDecrementoVetore {
  public static void main(String[] args) {
    
    int v[] = new int[10];
    String adicionar, remover, organizar;

    for (int i = 0; i < 10; i++){
      v[i] = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número do vetor"));
    }

    JOptionPane.showMessageDialog(null, v);
  }
}
