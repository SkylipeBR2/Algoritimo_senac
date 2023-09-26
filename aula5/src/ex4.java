import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int i = 0, soma = 0, x;
        Scanner sc = new Scanner(System.in);
        while(i < 10){
            System.out.print("Digite o item: " + i);
            x = sc.nextInt();
            if(x < 0){
                System.err.println("Numero invalido!");
                break;
            }
            soma+=x;
            i +=1;
        }
        System.out.println("TOTAL: " + soma);
    }
}
