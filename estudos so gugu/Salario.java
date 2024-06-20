import javax.swing.JOptionPane;

public class Salario {
    public static void main (String []args){
        double salarioBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do salario "));
        double salarioDescontado = (salarioBase*5)/100;//resultado do valor de 5% do salario
        double valorAjustado = (salarioDescontado+salarioBase);
        double valorDoImposto = (salarioBase*7)/100;//resultado de 7% do salario
        double valorDescontado = (valorAjustado-valorDoImposto);
        JOptionPane.showMessageDialog(null, " seu valor ja incluido 5% de gratuidade e descontado 7% de imposto e "+ valorDescontado);
    }
    
}
