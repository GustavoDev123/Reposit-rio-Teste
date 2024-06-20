import java.util.Scanner;

public class Fatorialç {
    //Escreva um programa que calcula o fatorial de um valor natural digitado pelo usuário
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número natural: ");
        int numero = scanner.nextInt();
        int cont =1;
        long fatorial = 1;
        for (cont=1;cont<numero;cont++) {
           fatorial = fatorial * cont;
        }
        
        
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
    

