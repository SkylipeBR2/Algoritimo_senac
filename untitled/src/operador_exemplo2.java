import java.util.Scanner;
public class operador_exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Número: ");
        int n = input.nextInt();

        if (n > 0) {
            System.out.println(n + " é positivo");
        } else if (n < 0) {
            System.out.println(n + " é negativo");
        } else {
            System.out.println(n + " é zero");
        }
    }
}
