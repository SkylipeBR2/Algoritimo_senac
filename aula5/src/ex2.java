public class ex2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 10;

        do {
            System.out.printf("%d é menor que %d \n"
                    , i, j);
            i++;
            j--;
        } while(i <= j);
    }
}
