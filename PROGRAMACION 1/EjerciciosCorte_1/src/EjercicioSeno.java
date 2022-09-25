/*
SE GENERARA EL CALCULO DE SENO DE CUALQUIER NUMERO
*/
import java.util.Scanner;
import java.lang.Math;
import java.util.*;
public class EjercicioSeno {
    public static void main(String[] arg){
            Scanner entrada = new Scanner (System.in);
        System.out.println("Digite el valor de x: ");
        double x = entrada.nextDouble();
        int n = 20;
        double sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum + (Math.pow(-1, i)* Math.pow(x, 2*i+1))/ factorial (2*i+1);
        }
        System.out.println("Sen(x): " + sum );
    }
    public static double factorial (int n){
        double fact = 1;
        for (int i=2; i<= n; i++){
            fact = fact* i;
        }
        return fact;
    }
}
