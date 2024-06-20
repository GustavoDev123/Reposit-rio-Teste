import javax.swing.JOptionPane;

public class Semana {
    //Usando switch-case, escreverum programa que lê um inteiro entre 1 e 7 e exibeo dia da semana 
    //correspondente a esse número. Isto é, domingo se 1, segunda-feira se 2, e  assim por diante.
    public static void main(String[] args) {
        String menuEscolha = JOptionPane.showInputDialog(null,"Menu de escolha :"
                                                            +"\n1 - "
                                                            +"\n2 - "
                                                            +"\n3 - "  
                                                            +"\n4 - "
                                                            +"\n5 - "
                                                            +"\n6 - "
                                                            +"\n7 - " );
        switch (menuEscolha){
         case "1":
         JOptionPane.showMessageDialog(null,"1 = Domingo");
         break;
         case "2":
         JOptionPane.showMessageDialog(null, "2 = Segunda");
         break;
         case "3":
         JOptionPane.showMessageDialog(null, "3 = Terça");
         break;
         case "4":
         JOptionPane.showMessageDialog(null, "4 = Quarta");
         break;
         case "5":
         JOptionPane.showMessageDialog( null, "5 = Quinta");
         break;
         case "6":
         JOptionPane.showMessageDialog(null,"6 = Sexta");
         break;
         case "7":
         JOptionPane.showMessageDialog(null,"7 = Sabado");
         break;
         default:
         }        

    }
    
}

