import javax.swing.*;
public class Vetor {
  public static void main(String[] args) {
    int VetSoma [] , i , soma = 0;
    VetSoma = new int[100];

    for (i = 0; i <= 49; i++){
      VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
      soma = soma + VetSoma[i];
      System.out.println(i);
    } 
    System.out.println("A soma dos valores é: "+soma);
    System.exit(0);
  }
}
