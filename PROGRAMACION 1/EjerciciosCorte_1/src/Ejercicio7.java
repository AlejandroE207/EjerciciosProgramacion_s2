/*
SE IMPRIMIRA LOS NUMEROS NATURALES DESDE EL 1 HASTA EL NUMERO DIGITADO
*/
import java.util.Scanner;
public class Ejercicio7 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Digite hasta que numero se imprimira: ");
        n = sc.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
    }
    
}
