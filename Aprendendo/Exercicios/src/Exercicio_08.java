import java.util.Scanner;

public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();
        int valor3 = sc.nextInt();
        while(valor1 > valor2 && valor1 > valor3 || valor2 > valor3 && valor2 > valor1 || valor3 > valor2 && valor3 > valor1) {
            System.out.println(valor1);
            System.out.println(valor2);
            System.out.println(valor3);
            break;
        }
    }
}
