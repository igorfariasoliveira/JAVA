package Vetores;

import java.util.Arrays;

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

  private static void adicionarElemento(int[] vetor) {
    int novoElemento = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento a ser adicionado:"));

    // Procura por um espaço vazio no vetor (valor 0) para adicionar o novo elemento
    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == 0) {
            vetor[i] = novoElemento;
            JOptionPane.showMessageDialog(null, "Elemento adicionado com sucesso!");
            return; // Sai do método após adicionar o elemento
        }
    }

    JOptionPane.showMessageDialog(null, "O vetor está cheio. Remova elementos antes de adicionar mais.");
}

  // Método para remover um elemento do vetor
  private static void removerElemento(int[] vetor) {
    int elementoRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento a ser removido:"));

    for (int i = 0; i < vetor.length; i++) {
        if (vetor[i] == elementoRemover) {
            vetor[i] = 0; // Define o elemento como zero para indicar remoção
            JOptionPane.showMessageDialog(null, "Elemento removido com sucesso!");
            return; // Sai do método após remover o elemento
        }
    }

    JOptionPane.showMessageDialog(null, "Elemento não encontrado no vetor.");
}

  // Método para organizar o vetor
    private static void organizarVetor(int[] vetor) {
        Arrays.sort(vetor);
        JOptionPane.showMessageDialog(null, "Vetor organizado com sucesso!");
    }
}
