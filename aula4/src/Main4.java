import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        float n1, n2, media;
        System.out.println("Aluno: ");
        nome = input.nextLine();
        System.out.println("N1: ");
        n1 = input.nextFloat();
        System.out.println("N2: ");
        n2 = input.nextFloat();
        media = (n1+n2)/2;
        System.out.printf("%s, \n" +
                "A média das notas %.1f e %.1f é:" +
                " %.2f \n", nome, n1, n2, media);
    }
}
