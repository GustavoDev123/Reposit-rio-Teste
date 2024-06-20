import javax.swing.JOptionPane;

public class Positivo {
    //Fazer um programa que recebe um número positivo, calcula e mostra:
    //a) O número digitado ao quadrado;
    //b) O número digitado ao cubo;
    //c)A raiz quadrada do número digitado.
    public static void main ( String []args){
    double numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um numero positivo ."));
    double resposta1 = (numero * numero);
    double resposta2 = (numero * numero * numero );
    double reposta3 = Math.sqrt(numero);
    JOptionPane.showMessageDialog(null, " 1 - O numero digitado ao quadrado e :" + resposta1 
                                                             +"\n2 - ao cubo :" + resposta2
                                                             +"\n3 - a raiz quadrada e :" +reposta3);
    }
}
