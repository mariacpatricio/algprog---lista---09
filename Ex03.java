import java.util.Scanner;

public class Ex03 {
    
    int resultado;
    
    public static void fazerSoma(int numeroUm, int numeroDois, int numeroTres) {
        
        System.out.println("O resultado da soma é: " + (numeroUm + numeroDois + numeroTres));
        
    }
 
    public static void main(String[] args) {
        
        int a, b, c;
        Scanner veja = new Scanner(System.in);
        
        System.out.println("Digite 3 números:");
        a = veja.nextInt();
        b = veja.nextInt();
        c = veja.nextInt();
        
        fazerSoma(a, b, c);
    }
}
