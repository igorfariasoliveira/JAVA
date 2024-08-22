package Programacao01;

public class Professor {
  String name;
  double salario;
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getSalario() {
    return salario;
  }
  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getInss(){
    return salario*0.11;
  }

  
}
