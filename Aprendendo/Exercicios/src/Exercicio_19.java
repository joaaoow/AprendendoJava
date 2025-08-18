public class Exercicio_19 {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.printf("---Tabuada do %d---\n", i);
            for(int j = 1; j <= 10; j++){
                int resultado = i * j;
                System.out.printf("%d x %d = %d\n", i, j, resultado);
            }
            System.out.println();
        }
    }
}
