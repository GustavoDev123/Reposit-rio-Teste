//ler uma opcao do usuario até que ele digite pare
import java.util.Scanner;
public class TesteLaco1 {
    public static void main(String[] args) {
        System.out.println("digite continue para continuar ou qualquer coisa para parar");
        Scanner sc = new Scanner(System.in);
        String opcao = sc.nextLine();
        while (opcao.equals("continue")) {
            System.out.println("para ou continua?");
            opcao = sc.nextLine();
        }
        sc.close();
    }
}
