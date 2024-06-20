import javax.swing.JOptionPane;

public class MaiorDeDois {
    public static void main (String[]args) {
    
         double numero1 = Double.parseDouble(JOptionPane.showInputDialog("digite o primeiro numero"));
         double numero2= Double.parseDouble(JOptionPane.showInputDialog("digite o segundo numero"));

         if(numero1>numero2){
            JOptionPane.showMessageDialog(null, numero1 + " e maior ");
         }
         else {
            JOptionPane.showMessageDialog(null, numero1 + " e menor");
         }
}
}   
