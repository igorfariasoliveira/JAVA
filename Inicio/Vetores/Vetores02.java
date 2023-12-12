package Vetores;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Vetores02 {
  public static void main(String[] args) {
    int num[] = {8,5,2,6,4};
    Arrays.sort(num);
    for(int cont: num){
      System.out.println(cont);
    }
  }
}
