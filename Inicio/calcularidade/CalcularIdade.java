package calcularidade;
import javax.swing.JOptionPane;
import java.time.LocalDate;

public class CalcularIdade {
  public static void main(String[] args) {
    int idade,nascimento;
    String nome;
    int anoAtual = LocalDate.now().getYear();

    nome = JOptionPane.showInputDialog("Qual o seu nome?");
    nascimento = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
    
    
    idade = anoAtual-nascimento;
    
    JOptionPane.showMessageDialog(null, "Olá, " +nome+"! Você tem "+idade+" anos");
  }
}
