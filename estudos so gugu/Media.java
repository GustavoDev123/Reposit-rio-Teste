import javax.swing.JOptionPane;

public class Media {
    
    public static void main ( String[]args){
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog( null, "digite o valor da nota da sua A1"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null," digite o valor da nota da sua A2"));
        double numero3 = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor da nota da sua A3" ));

        double resposta = ( numero1 + numero2 + numero3)/3;

        JOptionPane.showMessageDialog(null, "sua media e " + resposta);
    }
}
