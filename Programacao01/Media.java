package Programacao01;

import java.util.Scanner;

public class Media {
  
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    double nota01, nota02, nota03, media;

    System.out.println("Digite o valor da primeira nota: ");
    nota01 = input.nextDouble();

    System.out.println("Digite o valor da segunda nota: ");
    nota02 = input.nextDouble();

    System.out.println("Digite o valor da terceira nota: ");
    nota03 = input.nextDouble();

    media = (nota01+nota02+nota03)/3;

    System.out.println("Sua média foi: "+String.format("%.2f", media));

  }
}
