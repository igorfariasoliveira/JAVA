package procedimentos;

public class aula01 {
  static int soma(int a,int b){
    int s = a + b;
    return s;
  }
  public static void main(String[] args) {
    System.out.println("Resultado: ");
    int rec = soma(5,7);
    
    System.out.println(rec);
  }
}
