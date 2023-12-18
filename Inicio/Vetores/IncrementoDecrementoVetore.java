package Vetores;

import javax.swing.JOptionPane;

public class IncrementoDecrementoVetore {
  public static void main(String[] args) {

    int v[] = new int[10];
    String adicionar, remover, organizar, escolha;

    for (int i = 0; i < 10; i++) {
      v[i] = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número do vetor"));
    }

    StringBuilder mensagem = new StringBuilder("Vetor: ");
    for (int elemento : v) {
      mensagem.append(elemento).append(" ");
    }

    JOptionPane.showMessageDialog(null, mensagem.toString());
    escolha = JOptionPane.showInputDialog("Gostaria de editar seu vetor?");
    if (escolha.equalsIgnoreCase("sim")) {
      editarVetor(v);
      mostrarVetor(v);
    } else {
      JOptionPane.showMessageDialog(null, "Obrigado por usar o programa!");
    }
  }

  // Método para mostrar o vetor
  private static void mostrarVetor(int[] vetor) {
    StringBuilder mensagem = new StringBuilder("Vetor: ");
    for (int elemento : vetor) {
      mensagem.append(elemento).append(" ");
    }
    JOptionPane.showMessageDialog(null, mensagem.toString());
  }

  // Método para editar o vetor
  private static void editarVetor(int[] vetor) {
    String opcao;
    do {
      opcao = JOptionPane.showInputDialog(
          "Escolha uma opção:\n" +
              "1. Adicionar elemento\n" +
              "2. Remover elemento\n" +
              "3. Organizar vetor\n" +
              "4. Sair");

      switch (opcao) {
        case "1":
          adicionarElemento(vetor);
          break;
        case "2":
          removerElemento(vetor);
          break;
        case "3":
          organizarVetor(vetor);
          break;
        case "4":
          break;
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
      }
    } while (!opcao.equals("4"));
  }

  // Método para adicionar um elemento ao vetor
  private static void adicionarElemento(int[] vetor) {
    // Lógica para adicionar um elemento ao vetor
  }

  // Método para remover um elemento do vetor
  private static void removerElemento(int[] vetor) {
    // Lógica para remover um elemento do vetor
  }

  // Método para organizar o vetor
  private static void organizarVetor(int[] vetor) {
    // Lógica para organizar o vetor
    // Por exemplo, Arrays.sort(vetor);
  }
}
