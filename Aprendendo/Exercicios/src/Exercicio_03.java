public class Exercicio_03 {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 5;
        int resultado = 0;
        if(numero1 == numero2){
            resultado = numero1 + numero2;
        } else if(numero1 != numero2){
            resultado = numero1 * numero2;
        }

        System.out.println("Resultado: " + resultado);
    }
}
