import javax.swing.*;
public class Media {
  public static void main(String[] args ) {
    int VetSoma [] , i , soma = 0;
    double media = 0;
    VetSoma = new int[50];

    for (i = 0; i <= 49; i++){
      VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
      soma = soma + VetSoma[i];
    } 
    media = (double) soma/50;
    System.out.println("A soma dos valores é: "+soma);
    System.out.println("A média desses valores é: "+media);
    System.exit(0);
  }
}
