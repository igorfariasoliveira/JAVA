package Programacao01;

import java.util.ArrayList;

public class PraticandoArrayList {
  public static void main(String[] args) {
    
    ArrayList<String> times = new ArrayList<>();

    times.add("Flamengo");
    times.add("Grêmio");
    times.add("Vasco");
    times.add("Palmeiras");
    times.add("Fortaleza");

    System.out.println("Antes");

    for(String nome: times){
      System.out.println(nome);
    }
    
    times.set(1, "Internacional");

    
  
  }
}
