import java.util.Scanner;

public class MostraNImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print ("digite um valor inteiro positivo: ");
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.print ("o numero deve ser positivo: ");
            n = sc.nextInt();
        }
        int cont = 1;
        int impar = 1;
        while (cont <= n) {
            System.out.println(impar);
            cont++;
            impar = impar + 2;
            //soluço
            int j=1;
            while (j <= 100) {
                int k=1;
                while (k < 2000000000) {
                    k++;
                }
                j++;
            }
        }
    }
}
