import javax.swing.JOptionPane;

public class AntecessorSucessor {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um numero inteiro de 0 a 10"));

        if (numero<=0||numero>10){
            JOptionPane.showMessageDialog(null," numero invalido");
        }
        else if (numero==1){
            JOptionPane.showMessageDialog(null,"antecessor = 0"  
                                                          +"\nsucessor = 2 " );
        }
        else if (numero==2){
            JOptionPane.showMessageDialog(null,"antecessor = 1 " 
                                                          +"\nsucessor = 3 " );
        }
        else if (numero==3){
            JOptionPane.showMessageDialog(null,"antecessor = 2 " 
                                                          +"\nsucessor = 4 " );
        }
        else if (numero==4){
            JOptionPane.showMessageDialog(null,"antecessor = 3 " 
                                                          +"\nsucessor = 5 " );
        }  
        else if (numero==5){
            JOptionPane.showMessageDialog(null,"antecessor = 4 "
                                                            +"\nsucessor = 6 " );
        }
        else if (numero==6){
            JOptionPane.showMessageDialog(null,"antecessor = 5 "
                                                            +"\nsucessor = 7 " );
        }
        else if (numero==7){
            JOptionPane.showMessageDialog(null,"antecessor = 6 " 
                                                                +"\nsucessor = 8 " );
        }
        else if (numero==8){
            JOptionPane.showMessageDialog(null,"antecessor = 7 " 
                                                                +"\nsucessor = 9 " );
        }
        else if (numero==9){
            JOptionPane.showMessageDialog(null,"antecessor = 8 " 
                                                            +"sucessor = 10 " );
        }
        else if (numero==10){
            JOptionPane.showMessageDialog(null,"antecessor = 9 " 
                                                                +"\nsucessor = 11 " );
        }
   }
}