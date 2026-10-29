import java.util.Scanner;
public class Ex02 {

    public static void numeros(int quantidade) {
        for (int x = 1; x <= quantidade; x++) {
            for (int y = 1; y <= x; y++) {
               System.out.print(y + " ");
        }
        System.out.println();    
    }
 }
    public static void main(String[] args) {

        Scanner veja = new Scanner(System.in);
        
        int n;

        System.out.println("Digite o valor de n:");
        n = veja.nextInt();

        numeros(n);

    }
}
