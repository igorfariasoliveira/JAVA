package Programacao01;

public class Aluno extends Pessoa {

  double trabalho, prova;

 

  double resultado() {
    return ((trabalho + prova)/2);
  }
}
