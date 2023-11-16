package calculadora;
import javax.swing.JOptionPane;

public class CalculadoraComSeletor 
{
  public static void main(String[] args) 
  {
    int n1, n2, soma, sub, mult, div;
    String operacao;

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
    operacao = JOptionPane.showInputDialog("Escolha a operaçao desejada: \n + \n - \n * \n /");

    if (operacao.equals("+"))
    {
      soma = n1 + n2;
      JOptionPane.showMessageDialog(null, "O resultado é: "+soma);
    } else if (operacao.equals("-")) {
      sub = n1 - n2;
      JOptionPane.showMessageDialog(null, "O resultado é: "+sub);
    } else if (operacao.equals("*")) {
      mult = n1 * n2;
      JOptionPane.showMessageDialog(null, "O resultado é: "+mult);
    } else if (operacao.equals("/")) {
      if (n2 != 0) {
        div = n1 / n2;
        JOptionPane.showMessageDialog(null, "O resultado é: " + div);
    } else {
        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero");
    }
    } else{
      JOptionPane.showMessageDialog(null, "Erro");
    }

  }
}
