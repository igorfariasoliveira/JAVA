package calculadora;

import javax.swing.JOptionPane;

public class Calculadora 
{

  public static void main(String[] args) 
  {
    
    int n1, n2, soma, sub, mult, div, res;
    String msg="";

    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
    
    soma = n1 + n2;
    sub = n1 - n2;
    mult = n1 * n2;
    div = n1 / n2;
    res = n1 % n2;

    msg = msg + "Os resultados operacioanis dos números são: \n";
    msg = msg + "Soma: " + soma + "\n";
    msg = msg + "Subtração: " + sub + "\n";
    msg = msg + "Multiplicação: " + mult + "\n";
    msg = msg + "Divisão: " + div + "\n";
    msg = msg + "Resto: " + res + "\n";
    
    JOptionPane.showMessageDialog(null, msg);

   

  }
}