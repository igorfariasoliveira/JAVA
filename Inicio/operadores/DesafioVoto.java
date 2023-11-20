package operadores;
import javax.swing.*;

public class DesafioVoto {
  public static void main(String[] args) {
    int idade,ano;
    
    ano = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu?"));
    idade = 2023 - ano;
    String sit = ((idade>=16 && idade<=18) || idade>70)?"Opcional":"Obrigatorio";

    JOptionPane.showMessageDialog(null, sit);
  }
}
