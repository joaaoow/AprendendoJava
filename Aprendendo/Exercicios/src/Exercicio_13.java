import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.printf("%s é maior de idade!", nome);
        } else{
            System.out.printf("%s é menor de idade!", nome);
        }
    }
}
