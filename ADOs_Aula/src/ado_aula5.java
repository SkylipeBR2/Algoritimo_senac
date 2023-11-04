import java.util.Scanner;

public class ado_aula5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int x = 1;

        do {
            System.out.println("Digite um número entre 2 e 1000 para exibir a tabuada: ");
            num = input.nextInt();
        } while (num < 2 || num > 1000);
        input.close();

        System.out.println("A Tabuada do número: " + num);
        do {
            int result = x * num;
            System.out.println(x + " x " + num + " = " + result);
            x++;

        } while (x <= 10);
    }
}
