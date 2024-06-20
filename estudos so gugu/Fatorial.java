import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("digite um inteiro positivo: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print ("valor deve ser positivo: ");
            n = sc.nextInt();
        }
        int cont = 1;
        int fat = 1;
        while (cont <= n) {
            fat = fat * cont;
            System.out.println("parcial: " + fat);
            cont++;
        }
        System.out.println("fatorial de " + n + " = " + fat);
    }
}
