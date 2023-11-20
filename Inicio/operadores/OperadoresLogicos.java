package operadores;

public class OperadoresLogicos {
  public static void main(String[] args) {
    int x,y,z;
    x=3;
    y=5;
    z=8;
    boolean r;
    r = (x<y || y==z)?true:false;
    System.out.println(r);
  }
}
