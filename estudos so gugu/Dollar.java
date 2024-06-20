import javax.swing.JOptionPane;

public class Dollar {
    // Ler um  valor  em  real  e  a cotaçãodo  dólar.  
    //Em  seguida, exibir o valor  correspondente  em dólares. 
    public static void main(String[] args) {
        double real = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um valor em real"));
        double conversao = (real*0.2011);
        JOptionPane.showMessageDialog(null, real + " convertido em dolares e : " + conversao+"USD");
    }
}
