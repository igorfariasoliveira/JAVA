package idioamdosistema;
import java.util.Locale;

public class IdiomaDoSistema {
  public static void main(String[] args) {
    Locale idiomaSistema = Locale.getDefault();
    String idioma = idiomaSistema.getLanguage();

    System.out.println("O idioma do SO é " + idioma);
    
  }  
}
