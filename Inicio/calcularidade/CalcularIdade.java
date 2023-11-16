package calcularidade;
import javax.swing.JOptionPane;

public class CalcularIdade {
  public static void main(String[] args) {
    int idade;
    String nome;

    nome = JOptionPane.showInputDialog("Qual o seu nome?");
    idade = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
    
    
  }
}
