package estruturasderepeticao;

public class Testandorepeticao {
  public static void main(String[] args) {
    int carneirinhos=0;

    while (carneirinhos<10) {
      carneirinhos++;
      if (carneirinhos==5 || carneirinhos==7) {
        continue;
      }
      System.out.println((carneirinhos) + " carneirinhos");
      
    }
  }
}
