package Programacao01;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeNumeros {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();
    int c=0;
    int soma=0;

    do {
     
      System.out.println("Digite um número: ");
      numeros.add(input.nextInt());

      System.out.println("Deseja acrescentar mais um número? (1 para sim ou 0 para não)");
      c = input.nextInt();
      soma += numeros;
    
    }while (c != 0);


  }
}
