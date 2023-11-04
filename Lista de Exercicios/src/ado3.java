import java.util.Scanner;

public class ado3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite 10 números: ");
            int n = input.nextInt();

            if (n > user) {
                user = n;
            }
        }
        System.out.println("O maior é: " + user);
        input.close();
    }
}
