import javax.swing.*;

public class ProgramaMath02 
{
  public static void main(String entrada[]) 
  {
    int n1,n2,mod, div;
    double raiz1, raiz2, pot;
    String msg="";

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));

    mod = n1 % n2;
    raiz1 = Math.sqrt(n1);
    raiz2 = Math.sqrt(n2);
    div = (int)n1 / (int)n2;
    pot = Math.pow(n1, n2);

    msg = msg + "Resto da divisão de " + n1 + "por " + n2 + " = " + mod + "\n";
    msg = msg + "Raiz quadrada de " + n1 + " = " + raiz1 + "\n";
    msg = msg + "Raiz quadrada de " + n2 + " = " + raiz2 + "\n";
    msg = msg + "Quociente da divisao de n1 por n2 = " + div + "\n";
    msg = msg + "Potencia de n1 por n2 = " + pot + "\n";
    JOptionPane.showMessageDialog(null, msg);

    System.exit(0);
  }
}
