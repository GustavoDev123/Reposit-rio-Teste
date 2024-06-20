//mostrar os valores de 1 a 100
import javax.swing.JOptionPane;
public class TesteLaco2 {
    public static void main(String[] args) {
        int contador = 1;
        String sequencia = "";
        while (contador <= 100) {
            sequencia = sequencia + contador + " ";
            if (contador % 20 == 0) {
                sequencia = sequencia + "\n";
            }
            contador++;
        }
        JOptionPane.showMessageDialog(null, sequencia, "String montada", 1);
    }
}
