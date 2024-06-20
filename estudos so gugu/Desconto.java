import javax.swing.JOptionPane;

public class Desconto {
    public static void main ( String []args){
        double valorInicial = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor da sua compra"));
        double resposta = (valorInicial*10)/100;
        double resposta2 = (valorInicial - resposta);
        JOptionPane.showMessageDialog(null, " o valor da sua compra com 10% de desconto é "+ resposta2);
    }
    
}
