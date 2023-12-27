package procedimentos;

public class contador {
  public static String cont(int i, int f ){
    String s = "";
    for(int c = i; c <= f; c++){
      s += c +  " ";
    }
    return s;
  }
}
