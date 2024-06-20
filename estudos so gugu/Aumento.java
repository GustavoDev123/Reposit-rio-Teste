import javax.swing.JOptionPane;

public class Aumento {
    //Fazer  um  programa  que  recebe  o  salário  de  um  funcionário  e  o  percentual  de aumento
    //calcula e mostra o valor do aumento e o novo salário.
    public static void main (String[]args){
        double salario = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o valor do salario"));
        double Pa = Double.parseDouble(JOptionPane.showInputDialog(null,"digite o percentula de aumento"));
        double resposta = (Pa * salario)/100;
        double soma = (salario + resposta);
        JOptionPane.showMessageDialog(null," Valor de aumento : "+ resposta
                                                          +"\nNovo salario : " + soma );
        
                                                        

    }

    
}
