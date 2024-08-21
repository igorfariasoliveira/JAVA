package Programacao01;
public class Aluno {
  String nome;
  double trabalho, prova;

  public void configurarNome(String nome){
    this.nome = nome;
  };
  
  double resultado() {
    return ((trabalho + prova)/2);
  }
}
