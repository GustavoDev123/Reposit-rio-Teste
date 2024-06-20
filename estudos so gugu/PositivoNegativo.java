import javax.swing.JOptionPane;

public class PositivoNegativo {
    public static void main ( String []args) {
        String pergunta = JOptionPane.showInputDialog(" digite um numero qualquer ");

        Double numero = Double.parseDouble(pergunta);

        if (numero>0){
            JOptionPane.showMessageDialog(null, numero + " e positivo");
        }
        else if (numero<0){
            JOptionPane.showMessageDialog(null, " e negativo");
        }
    }
}
