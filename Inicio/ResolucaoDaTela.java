import java.awt.Toolkit;
import java.awt.Dimension;

public class ResolucaoDaTela {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();
        int largura = (int) resolucao.getWidth();
        int altura = (int) resolucao.getHeight();

        System.out.println("Resolução da tela: " + largura + "x" + altura);
    }
}
