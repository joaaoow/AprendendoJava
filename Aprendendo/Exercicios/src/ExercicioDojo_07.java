public class ExercicioDojo_07 {
    public static void main(String[] args) {
        int valorCarro = 40000;
        for (int i = 1; i <= valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela: " + i + " R$ " + valorParcela);
        }
    }
}
