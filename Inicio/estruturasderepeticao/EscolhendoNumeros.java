package estruturasderepeticao;

import javax.swing.JOptionPane;

public class EscolhendoNumeros {
  public static void main(String[] args) {
    int numb, pares = 0, impares = 0, acima = 0, media;
    int c=0;
    do {
      numb = Integer.parseInt(JOptionPane.showInputDialog("Escolha um número! Se quiser interromper aperte 0"));
      if (numb % 2 == 0) {
        pares++;
      }
      if (numb % 2 != 0) {
        impares++;
      }
      if(numb > 100){
        acima++;
      }
      c++;

    } while(numb!=0);

    media = numb/c;
    JOptionPane.showMessageDialog(null, "Resultados: \n"+"Toral de valore:" +c+"\n" + "Total de pares: "+ pares + "\n"+"total de impares");
  }
}
