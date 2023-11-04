public class ado8 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 14; i <= 72; i += 2) {
            sum += i;
            count++;
        }
        if (count > 0) {
            double media = (double) sum / count;
            System.out.println("A Média dos números pares entre 13 e 73 é: " + media);
        } else {
            System.out.println("Número não encontrado!");
        }
    }
}
