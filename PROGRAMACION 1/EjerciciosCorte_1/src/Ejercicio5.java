/*
IMPRIMIR Y CONTAR LOS MULTIPLOS DE 3 DESDE LA UNIDAD HASTA UN NUMERO
QUE INTRODUCIMOS POR TECLADO
*/
import java.util.Scanner;
public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numFin;
        int contMult3=0;
        
        System.out.println("Digite haste que numero se verificaran los multiplos de 3: ");
        numFin = sc.nextInt();
        System.out.println("***** Multiplos de 3 *****");
        for(int i=1;i<=numFin;i++){
            if(i%3==0){
                contMult3++;
                System.out.println(i);
            }
        }
        System.out.println("Total de multiplos de 3: "+contMult3);
    }
    
}
