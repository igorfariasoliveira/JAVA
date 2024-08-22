package Programacao01;

public class Professor extends Pessoa{
  
  double salario;
  
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getInss(){
    return salario*0.11;
  }

  public double getSalarioLiquido(){
    return salario-getInss();
  }
  
}
