package procedimentos;

public class Fatorial {
  
  private int num;
  private int fat;
  private String formula = "";

  public void setValor(int n){
    num = n;
    int f = 1;
    String s = "";
    for(int c = n; c > 1; c--){
      f *= c;
      s += c + " x ";
    }
    s += "1 = ";
    
  }
}
