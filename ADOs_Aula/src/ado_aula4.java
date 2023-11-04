import java.util.Scanner;

public class ado_aula4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0, positivo = 0;
        float sum = 0.0f;

        System.out.println("Digite 6 valores: ");
        while (count < 6) {
            float valor = input.nextFloat();
            if (valor > 0) {
                sum += valor;
                positivo++;
            }
            count++;
        }

        input.close();

        if (positivo > 0) {
            double mediaValores = sum / positivo;
            System.out.println("(1) Soma dos valores positivos: " + sum);
            System.out.println("(2) Quantidade dos valores positivos: " + positivo);

            System.out.println("(3) Média dos valores positivos: " + mediaValores);

        } else {
            System.out.println("Nenhum não encontrado.");
        }
    }
}
