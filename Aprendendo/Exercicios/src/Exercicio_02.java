public class Exercicio_02 {
    public static void main(String[] args) {
        int numero = -3;
        if(numero % 2 == 0 && numero > 0){
            System.out.println("Número Par e Positivo\n");
        } else if(numero % 2 == 0 && numero < 0){
            System.out.println("Número Par e Negativo\n");
        } else if(numero % 3 == 0 && numero > 0){
            System.out.println("Número Impar e Positivo\n");
        } else if(numero % 3 == 0 && numero < 0){
            System.out.println("Número Impar e Negativo\n");
        }
    }
}
