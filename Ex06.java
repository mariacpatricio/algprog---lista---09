import java.util.Scanner;

public class Ex06 {
    
    public static void fazerConversao(int horas, int minutos, char conversao) {
        
        if(conversao == 'P'){
            if(horas > 12) {
            System.out.println((horas - 12) + ":" + minutos + "P.M");
        }
        
        else {
            System.out.println(horas+ ":" + minutos + "P.M");
        }
    }
    
    if(conversao == 'A') {
        if(horas > 12) {
        System.out.println((horas - 12) + ":" + minutos + "A.M"); 
        }
        else if (horas == 0) {
            System.out.println(12 + ":" + minutos + "A.M");
        }
        
        else {
            System.out.println(horas + ":" + minutos + "A.M");
        }
    }
    
    }
    
    public static void main(String[] args) {
        
        int hora;
        int minuto;
        int continuar = 1;
        char converter;
        
        Scanner veja = new Scanner(System.in);
        
        while(continuar == 1) {
            System.out.println("Deseja fazer uma conversão? 1 para SIM e 0 para NÃO.");
            continuar = veja.nextInt();
            
            if(continuar == 0) {
                break;
            }
            
            System.out.println("Digite as horas:");
            hora = veja.nextInt();
            
            System.out.println("Digite os minutos:");
            minuto = veja.nextInt();
            
            System.out.println("Digite a conversão desejada: \nA para A.M \nP para P.M");
            converter = veja.next().charAt(0);
            
            fazerConversao(hora, minuto, converter);
       
        }

    }
}