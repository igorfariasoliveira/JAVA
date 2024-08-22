package Programacao01;

public class Situacao {
  public static void main(String[] args) {
    
    Aluno aluno = new Aluno();
    Professor professor = new Professor();

    aluno.setName("Igor");
    aluno.trabalho = 10;
    aluno.prova = 5;

    
    System.out.println("O aluno "+aluno.getName()+" teve uma média de "+aluno.resultado());

    professor.setName("Einstein");
    professor.setSalario(1000);

    System.out.println("O professor "+professor.getName());
    System.out.println("Recebe um sário de R$"+professor.getSalario());
    System.out.println("Descontando 11% do INSS fica para receber liquido R$"+professor.getSalarioLiquido());
  }
}
