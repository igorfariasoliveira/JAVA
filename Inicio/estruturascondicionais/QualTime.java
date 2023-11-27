package estruturascondicionais;

import java.util.Scanner;

public class QualTime {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int titulos = teclado.nextInt();
    String time="";
    switch (titulos) {
      case 1:
        time = "Vasco";
        break;
      case 2:
        time = "cruzeiro";
        break;
      case 3:
      time = "Flamengo";
        break;
      default:
        break;
    }
    System.out.println(time);

  }
}
