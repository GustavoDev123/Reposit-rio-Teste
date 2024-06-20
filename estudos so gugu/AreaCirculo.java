import javax.swing.JOptionPane;

public class AreaCirculo {
    public static void main ( String []args){
        //Fazer um programa que calcula e mostra a área de um círculo, sabendo que:área = pi * r2.
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do raio"));
        double resposta = (r*r) * 3.14;
        JOptionPane.showMessageDialog(null," o valor da area do circulo é " + resposta);
    }
}
    
