import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, somaImpar = 0, somaPar = 0;
        for (int i = 0; i < 10; i++){
            System.out.println(i + " Digite o número de x: " );
            x = input.nextInt();
            if (x % 2 == 0){
                somaPar  = somaPar + x;
            } else {
                somaImpar = somaImpar + x;
            }
        }
        System.out.println("Impar: " + somaImpar);
        System.out.println("Par: " + somaPar);
    }
}
