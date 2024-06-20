import javax.swing.JOptionPane;

public class ImparPar {

    public static void main(String[] args) {
        
        String auxiliar = JOptionPane.showInputDialog("digite um numero");
        int numero = Integer.parseInt(auxiliar);

        int resto = numero % 2;
        
        if ( resto == 0) {
            JOptionPane.showInputDialog(null, numero + " e par");
        }

        else if ( numero > 0 ){
            JOptionPane.showInputDialog(null, numero + " e impar");
        }
    }
}