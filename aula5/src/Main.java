import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor Inicial: ");
        int inicio = scanner.nextInt();
        System.out.println("Valor Final ");
        int fim = scanner.nextInt();

        while (inicio <= fim) {
            if (inicio % 2 == 0)
                System.out.println("i: " + inicio);
                inicio++;
            }
        while (inicio >= fim) {
            if (fim % 2 == 1)
                System.out.println("i: " + fim);
            fim++;
        }
            System.out.println("Fora do While");
        }
    }
