import javax.swing.JOptionPane;

public class PesoIdeal {
    public static void main (String[]args){
        //Para homens: (72.7*h) -58Para mulheres: (62.1*h) -44.7
        //Tendo  como  dados  de  entrada  a  altura (h) e  o  sexo  de  uma  pessoa
        String genero = JOptionPane.showInputDialog(null, "Digite H ( Homem ) ou M ( Mulher ).");
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura."));

        if ( genero.equals("H")){
            JOptionPane.showMessageDialog(null," seu peso ideal é " + ((72.7 * altura) - 58));
        }
        else if ( genero.equals("M")){
            JOptionPane.showMessageDialog(null," seu peso ideal é " +((62.1 * altura)-44.7)); 
        }
    
}
}