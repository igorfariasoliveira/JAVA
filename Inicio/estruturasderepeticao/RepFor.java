package estruturasderepeticao;

public class RepFor {
  public static void main(String[] args) {
    /*for(int cc=0;cc<=100;cc+=10){
      System.out.println(cc);
    }*/
    for (int i = 0; i<=3; i++) {
      System.out.println("I = "+i);
      for(int o = 0; o<=5;o++){
        System.out.println("O = "+o);
      }
    }
  }
}
