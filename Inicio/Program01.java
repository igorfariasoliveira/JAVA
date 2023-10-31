public class Program01
{
  public static void main(String entrada[]) 
  {
    int NumbInt;
    double NumReal, soma;
    char Caracter;

    NumbInt = Integer.parseInt(entrada[0]);
    NumReal = Double.parseDouble(entrada[1]);
    Caracter = (entrada[2]) .charAt(0);

    soma = (double)NumbInt + NumReal;

    System.out.println((double)NumbInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);

    System.exit(0);
  }  
}
