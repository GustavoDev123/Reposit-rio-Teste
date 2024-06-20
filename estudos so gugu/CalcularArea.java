import javax.swing.JOptionPane;

public class CalcularArea {
    public static void main ( String[]args){
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da base do seu triangulo"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o valor da altura do seu triangulgo"));

        double resposta = ( numero1*numero2)/2;
        
        JOptionPane.showMessageDialog(null," a area do seu triangulo é " + resposta);
    }
}
