package estruturasderepeticao;

public class Testandorepeticao {
  public static void main(String[] args) {
    int carneirinhos=0;

    while (carneirinhos<10) {
      carneirinhos++;
      if (carneirinhos%2==0) {
        continue;
      }
      System.out.println((carneirinhos) + " carneirinhos");
      
    }
  }
}
