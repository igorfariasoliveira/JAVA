package Programacao01;
public class Aluno {
  String nome;
  double trabalho, prova;

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return this.nome;
  }

  double resultado() {
    return ((trabalho + prova)/2);
  }
}
