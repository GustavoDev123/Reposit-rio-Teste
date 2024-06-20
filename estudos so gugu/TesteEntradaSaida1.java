import java.util.Scanner;
public class TesteEntradaSaida1 {
    public static void main(String[] args) {
        int i;
        double d;
        char c;
        boolean b;
        String sequencia1, sequencia2;
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("digite um valor logico:");
        // b = sc.nextBoolean();
        // System.out.println("o boolean e: " + b);

        System.out.println("digite um valor inteiro:");
        i = sc.nextInt();
        System.out.print("digite uma frase: ");
        sequencia1 = sc.nextLine();
        System.out.print("digite outra frase: ");
        sequencia2 = sc.next(); //pode dar problema
        System.out.println("digite um valor com casas decimais");
        d = sc.nextDouble();
        sc.nextLine();
        System.out.print("digite so uma letra: ");
        c = sc.nextLine().charAt(0);

        System.out.println("sequencia 1: " + sequencia1);
        System.out.println("sequencia 2: " + sequencia2);
        System.out.println("o inteiro e: " + i);
        System.out.println("o double e: " + d);
        System.out.println("sua letrinha: " + c);
    }
}
