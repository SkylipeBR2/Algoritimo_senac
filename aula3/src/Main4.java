import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Códigos das operações: ");
        System.out.println("100 - Cachorro quente - R$1,70");
        System.out.println("101 - Bauru simples - R$2,30");
        System.out.println("102 - Bauru com queijo - R$2,60");
        System.out.println("103 - Hambúrguer - R$2,40");
        System.out.println("104 - Cheeseburger - R$2,50");
        System.out.println("105 - Refrigerante - R$1,00");

        for (byte i = 0; i <= 2; i++){
            System.out.println(".");
        }

        for (int i = 0; i <= 2; i++){
            System.out.println(".");
        }

        System.out.print("Digite o código do produto: ");
        byte codProduto = input.nextByte();
        System.out.print("Digite a quantidade: ");
        byte quantProduto = input.nextByte();


        switch (codProduto) {
            case 100:
                float total100 = (1.70f * quantProduto);
                System.out.println("Valor total: R$" + total100);
                break;
            case 101:
                float total101 = (2.30f * quantProduto);
                System.out.println("Valor total: R$" + total101);
                break;
            case 102:
                float total102 = (2.60f * quantProduto);
                System.out.println("Valor total: R$" + total102);
                break;
            case 103:
                float total103 = (2.40f * quantProduto);
                System.out.println("Valor total: R$" + total103);
                break;
            case 104:
                float total104 = (2.50f * quantProduto);
                System.out.println("Valor total: R$" + total104);
                break;
            case 105:
                float total105 = (1.00f * quantProduto);
                System.out.println("Valor total: R$" + total105);
                break;
            default:
                System.out.println("Sem fome! Deixa para próxima então!");
        }
    }
}
