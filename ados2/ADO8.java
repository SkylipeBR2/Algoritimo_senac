public class mediaNuPares {
    public static void main(String[] args) {
        
    int soma = 0;
    int contador = 0;

    for (int i = 14; i <= 72; i += 2) {
        soma += i;
        contador++;
    }
    if (contador > 0) {
        double media = (double) soma / contador;
        System.out.println("Média dos números pares entre 13 e 73: " + media);
    } else {
        System.out.println("Nenhum número par foi encontrado :(");
    }
 }
}
