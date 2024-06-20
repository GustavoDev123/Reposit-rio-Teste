import javax.swing.JOptionPane;

public class Soma {
    public static void main ( String []args){
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));

        int soma = (numero1 + numero2);

        if(soma%2==0){
            JOptionPane.showInputDialog(null,soma+ " e par");
        }
        else {
            JOptionPane.showInputDialog(null,soma+ " é impar");
        }
    }
}
