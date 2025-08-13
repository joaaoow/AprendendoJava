import java.util.Scanner;

public class Exercicio_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de a: ");
        int a = sc.nextInt();
        System.out.println("Informe o valor de b: ");
        int b = sc.nextInt();

        System.out.println("Valor a antes da troca: " + a);
        System.out.println("Valor b antes da troca: " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Valor a depois da troca: " + a);
        System.out.println("Valor b depois da troca: " + b);
    }
}
