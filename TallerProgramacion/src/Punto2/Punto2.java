
package Punto2;
import java.util.*;
public class Punto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n,k;
        int n=5; int k=1;
        int [] estante1= {3,5,2,7,1};
        int [] estante2= {14,2,3,10,4};
//        System.out.print("Ingrese la cantidad de libros que hay por estante: ");
//        n=sc.nextInt();
//        System.out.print("Ingrese la cantidad de cambios disponibles: ");
//        k=sc.nextInt();
//        int [] estante1= new int [n];
//        int [] estante2= new int [n];
//        
//        System.out.println("INGRESO DE VALORES DEL ESTANTE 1");
//        for(int i=0;i<n;i++){
//            System.out.print("Digita el tamaño del libro #"+i+": ");
//            estante1[i]=sc.nextInt();
//        }
//        System.out.println("INGRESO DE VALORES DEL ESTANTE 2");
//        for(int i=0;i<n;i++){
//            System.out.print("Digita el tamaño del libro #"+i+": ");
//            estante2[i]=sc.nextInt();
//        }
        int numMaxEst1=estante1[0];
        int posMaxEst1=0;
        int numMaxEst2=estante2[0];
        int posMaxEst2=0;
        
        int numMinEst1=estante1[0];
        int posMinEst1=1;
        int numMinEst2=estante2[0];
        int posMinEst2=0;
        
        for(int g = 0;g<n;g++){
            for(int i=0;i<n;i++){
                if(numMaxEst1<estante1[i]){
                    numMaxEst1=estante1[i];
                    posMaxEst1=i;
                }
                if(numMinEst1>estante1[i]){
                    numMinEst1=estante1[i];
                    posMinEst1=i;
                }
            }
            System.out.println("numero max est1: "+numMaxEst1);
            System.out.println("posicion numero max est1: "+posMaxEst1);
            System.out.println("numero min est1: "+numMinEst1);
            System.out.println("posicion numero min est1: "+posMinEst1);
            for(int j=0;j<n;j++){
                if(numMaxEst2<estante2[j]){
                    numMaxEst2=estante2[j];
                    posMaxEst2=j;
                }
                if(numMinEst2>estante2[j]){
                    numMinEst2=estante2[j];
                    posMinEst2=j;
                }
            }
            System.out.println("numero max est2: "+numMaxEst2);
            System.out.println("posicion numero max est2: "+posMaxEst2);
            System.out.println("numero min est2: "+numMinEst2);
            System.out.println("posicion numero min est2: "+posMinEst2);
            
            //CAMBIO DE VALORES
            if(numMaxEst1<numMaxEst2){
                int numAux;
                numAux = estante1[posMaxEst1];
                estante1[posMaxEst1]=numMinEst2;
                estante2[posMinEst2]=numAux;
                
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.print(estante1[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print(estante2[i]+" ");
        }
    }
}


