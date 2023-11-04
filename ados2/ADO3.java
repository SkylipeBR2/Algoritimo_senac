import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maior = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite 10 números diferentes: ");
            int n = input.nextInt();
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("O maior número é: " + maior);
        input.close();
    }
}
