public class Exercicio_09 {
    public static void main(String[] args) {
        double peso = 70.5;
        double altura = 1.81;
        double resultadoIMC= peso / ( altura * altura);
                if(resultadoIMC < 18.5){
                    System.out.println("Abaixo do peso");
                } else if(resultadoIMC >= 18.6 && resultadoIMC <= 24.9){
                    System.out.println("Peso ideal(Parabéns)");
                } else if(resultadoIMC >= 25.0 && resultadoIMC <= 29.9){
                    System.out.println("Levemente acima do peso");
                } else if(resultadoIMC >= 30.0 && resultadoIMC <= 34.9){
                    System.out.println("Obresidade grau I");
                } else if(resultadoIMC >= 35.0 && resultadoIMC <= 39.9){
                    System.out.println("Obresidade grau II(severa)");
                } else if(resultadoIMC >= 40.0){
                    System.out.println("Obesidade grau III(morbida)");
                }
    }
}
