package Programacao01;

public class Situacao {
  public static void main(String[] args) {
    
    Aluno objeto = new Aluno();

    objeto.nome = "Igor";
    objeto.trabalho = 10;
    objeto.prova = 5;

    System.out.println(objeto.resultado());
  }
}
