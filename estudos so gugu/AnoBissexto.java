import javax.swing.JOptionPane;

public class AnoBissexto{
    public static void main(String[] args) {
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null,"digite um ano ( ex : 2024) : "));
        int resultado = ( ano % 4 );  
        if (resultado==0){
            JOptionPane.showMessageDialog(null,ano + " o ano digitado e bissexto");
        }  
        else {
            JOptionPane.showMessageDialog(null,ano + " o ano digitado nao e bissexto");
        }
    }
}