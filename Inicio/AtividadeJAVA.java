import javax.swing.*;

public class AtividadeJAVA
{
  public static void main(String entrada[]) 
  {
    int n1, n2, div;
    double pot;
    String msg="";

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

    div = (int)n1 / (int)n2;
    pot = Math.pow(n1, n2);

    msg = msg + "Quociente da divisao de n1 por n2 = " + div + "\n";
    msg = msg + "Potencia de n1 por n2 = " + pot + "\n";
    JOptionPane.showMessageDialog(null, msg);

    System.exit(0);
  }  
}
