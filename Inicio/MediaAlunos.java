import java.text.DecimalFormat;

import javax.swing.*;

public class MediaAlunos {

  public static void main(String[] args) {
    double nota01, nota02, nota03, media;
    
    nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
    nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno"));
    nota03 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do aluno"));

    media = (nota01 + nota02 + nota03)/3;
    
    DecimalFormat formato = new DecimalFormat("#.0");

    if (media >= 7) 
    {
      JOptionPane.showMessageDialog(null,"A média do aluno é: \n"+ formato.format(media)+ "\n" + "Ele foi aprovado");
    }
    else
    {
      JOptionPane.showMessageDialog(null,"A média do aluno é: \n"+ formato.format(media) + "\n" + "Ele foi reprovado");
    }
  }
}