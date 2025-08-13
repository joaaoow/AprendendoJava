import java.util.Scanner;

public class Exercicio_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho do primeiro lado: ");
        float lado1 = sc.nextFloat();
        System.out.println("\nInforme o tamanho do segundo lado: ");
        float lado2 = sc.nextFloat();
        System.out.println("\nInforme o tamanho do terceiro lado: ");
        float lado3 = sc.nextFloat();
        sc.close();

        System.out.printf("Primeiro lado: %.2f\n", lado1);
        System.out.printf("Segundo lado: %.2f\n", lado2);
        System.out.printf("Terceiro lado: %.2f\n", lado3);

        if(lado1 == lado2 && lado2 == lado3 && lado3 == lado1){
            System.out.println("Este e um triângulo equilátero");
        } else if(lado1 == lado2 && lado2 != lado3 && lado3 != lado1){
            System.out.println("Este e um triangulo isóceles");
        } else if(lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
            System.out.println("Este e um triangulo escaleno");
        }
    }
}
