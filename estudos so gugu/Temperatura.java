import javax.swing.JOptionPane;

public class Temperatura {
    public static void main(String[] args) {
        double c = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a temperatura em Celcius " ));
        double conversao = ((c*(9.0/5.0)+32.0));
        JOptionPane.showMessageDialog(null, "A temperatura convertida em  Fahrenheit e == "+ conversao);
    }
}
