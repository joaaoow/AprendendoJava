public class ExercicioDojo_03 {
    public static void main(String[] args) {
        //Valores de 1 a 7, usando o switch diga se é dia útil ou não
        byte dia = 6;
        switch (dia) {
            case 1:
                System.out.println("Domingo - Não é dia útil");
                break;
            case 2:
                System.out.println("Segunda - É um dia útil");
                break;
            case 3:
                System.out.println("Terça - É um dia útil");
                break;
            case 4:
                System.out.println("Quarta - É um dia útil");
                break;
            case 5:
                System.out.println("Quinta - É um dia útil");
                break;
            case 6:
                System.out.println("Sexta - É um dia útil");
                break;
            case 7:
                System.out.println("Sábado - não é um dia útil");
                break;
            default:
                System.out.println("Erro");
        }
    }
}
