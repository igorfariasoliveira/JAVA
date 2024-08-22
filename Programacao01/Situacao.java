package Programacao01;

public class Situacao {
  public static void main(String[] args) {
    
    Aluno aluno = new Aluno();
    Professor professor = new Professor();

    aluno.setNome("Igor");
    aluno.trabalho = 10;
    aluno.prova = 5;

    
    System.out.println("O aluno "+aluno.getNome()+" teve uma média de "+aluno.resultado());

    professor.setName("Einstein");
    professor.setSalario(1000);

    System.out.println("");
    System.out.println();
    System.out.println();
  }
}
