
public class decrescente {
    public static void main(String[] args) {
        
        System.out.println("--Números pares em ordem decrescente--");
        for(int i = 100; i >= 1; i--) {
            if ( i %2 == 0) {
                System.out.println(i);
            }
        }
    }
}
