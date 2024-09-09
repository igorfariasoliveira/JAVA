package Programacao01;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeNumeros {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    ArrayList<Integer> numeros = new ArrayList<>();
    int c, numusuario;
    int soma=0;

    do {
     
      System.out.println("Digite um número: ");
      numusuario = input.nextInt();
      numeros.add(numusuario);

      System.out.println("Deseja acrescentar mais um número? (1 para sim ou 0 para não)");
      c = input.nextInt();
      soma += numusuario;
    
    }while (c != 0);

    System.out.println("Os números digitados foram: "+numeros);
    System.out.println("A soma desses números é "+soma);
  }
}
