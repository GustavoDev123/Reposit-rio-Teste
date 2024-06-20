import javax.swing.JOptionPane;

public class ComparaDoisValores {
    public static void main (String[]args){
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite um numero"));
        double numero2 =Double.parseDouble(JOptionPane.showInputDialog(null,"digite outro numero"));

        if (numero1==numero2){
            JOptionPane.showMessageDialog(null, numero1 + " e " + numero2 + " sao iguais");
        }
        else if ( numero1>numero2){
            JOptionPane.showMessageDialog(null, numero1 + " e maior");
        }
        else { JOptionPane.showMessageDialog(null, numero1 + " e menor");
        }
        
    }
}
