package operadores;

import javax.swing.JOptionPane;

public class DesafioNumeroAleatorio {
  public static void main(String[] args) {
    int numeroAleatorio = (int) (Math.random() * 5) + 1;
    int numerousuario;

    numerousuario = Integer.parseInt(JOptionPane.showInputDialog("Tente advinhar em qual número estou penando"));

  String resultado = numeroAleatorio==numerousuario?"Parabens, você acertou":"Que pena. Você errou. Eu estava penando no número: "+numeroAleatorio+" Tente novamente";

  JOptionPane.showMessageDialog(null, resultado);
  }
}
