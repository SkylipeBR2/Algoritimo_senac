import java.util.Scanner;

public class ado2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int num = 1;

        System.out.println("Digite um número para realizar o calculo: ");
        int user = input.nextInt();

        while (num <= user) {
            sum += num;
            num++;
        }
        System.out.println("A soma de de 1 a " + user + " é igual a: " + sum);
        input.close();
    }
}
