//Desarrollar un programa que permita solicitar 15 valores al usuario mostrar el resultado de la suma de los mismos y su promedio.
package codigosaulas;
import java.util.*;
public class SumaDe15Num {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,sum=0,prom=0;
        
        for(int i=1;i<=15;i++){
            System.out.print("Digite el valor del numero "+i+": ");
            n=sc.nextInt();
            sum+=n;
        }
        prom=sum/15;
        
        System.out.println("La sumatoria de los primeros 15 numeros es: "+sum);
        System.out.println("El promedio de los primeros 15 numeros es: "+prom);
    }
    
}
