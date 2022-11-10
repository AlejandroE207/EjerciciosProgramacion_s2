
package Punto2;
import java.util.*;
public class Punto2e {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5,k=1;
        int []vector={3,5,2,7,1,14,2,3,10,4};
//        System.out.print("Digite la cantidad de libros en cada estante: ");
//        n=sc.nextInt();
//        System.out.print("Digite la cantidad de cambios disponibles a hacer: ");
//        k=sc.nextInt();
//        int []vector=new int [(2*n)];
//        System.out.println("Digite los tamaños del estante 1");
//        for(int i=1;i<=n;i++){
//            vector[i]=sc.nextInt();
//        }
//        System.out.println("DIGITE LOS TAMAÑOS ESTANTE 2");
//        for(int i=n;i<(2*n);i++){
//            vector[i]=sc.nextInt();
//        }
        int maxEst1=0,minEst1=9999,posMax1=0,posMin1=1;
        int maxEst2=0,minEst2=9999,posMax2=0,posMin2=1;
        for(int i=1;i<(2*n);i++){
            System.out.print(vector[i]+" ");
        }
        
        for(int i=0;i<k;i++){
            for(int j=0;j<=n;j++){
                if(maxEst1<vector[j]){
                    maxEst1=vector[j];
                }
                if(minEst1>vector[i]){
                    minEst1=vector[i];
                }
            }
            for(int j=0;j<(2*n);j++){
                if(maxEst2<vector[j]){
                    maxEst2=vector[j];
                }
                if(minEst2>vector[j]){
                    minEst2=vector[j];
                }
            }
            System.out.println("max estante 1: "+maxEst1);
            System.out.println("max estante 2: "+maxEst2);
        }
    }
    
}
