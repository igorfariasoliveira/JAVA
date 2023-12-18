package Vetores;

import javax.swing.JOptionPane;

public class IncrementoDecrementoVetore {
  public static void main(String[] args) {
    
    int v[] = new int[10];
    String adicionar, remover, organizar, escolha;

    for (int i = 0; i < 10; i++){
      v[i] = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número do vetor"));
    }
    
    StringBuilder mensagem = new StringBuilder("Vetor: ");
    for (int elemento : v) {
        mensagem.append(elemento).append(" ");
    }

    JOptionPane.showMessageDialog(null, mensagem.toString());
    escolha = JOptionPane.showInputDialog("Gostaria de editar seu vetor?");
  }
}
