package calculadora;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class CalculadoraCientifica {
  public static void main(String[] args) {
    int n1, resto;
    String msg="";
    

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para as operações"));

    resto = n1%2;
    double cubo = Math.pow(n1, 3);
    double raiz = Math.sqrt(n1);
    double raizCubica = Math.cbrt(n1);
    int valorAbsoluto = Math.abs(n1);

    DecimalFormat formato = new DecimalFormat("#.00");

    msg = msg + "Os resultados operacioanis do número são: \n";
    msg = msg + resto+ "\n";
    msg = msg + cubo+ "\n";
    msg = msg + formato.format(raiz)+ "\n";
    msg = msg + formato.format(raizCubica)+ "\n";
    msg = msg + valorAbsoluto+ "\n";
    
    JOptionPane.showMessageDialog(null, msg);

  }
}
