package Programacao01;

public class Situacao {
  public static void main(String[] args) {
    
    Aluno aluno = new Aluno();

    aluno.configurarNome("Igor");
    aluno.trabalho = 10;
    aluno.prova = 5;

    
    System.out.println("O aluno "+aluno.nome+" teve uma média de "+aluno.resultado());
  }
}
