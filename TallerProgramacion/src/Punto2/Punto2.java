
package Punto2;
import java.util.*;
public class Punto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5; int k=1;
        int indice;
//        int [] estante1= {3,5,2,7,1};
//        int [] estante2= {14,2,3,10,4};
        System.out.println("////////// PUNTO 2 //////////");
        System.out.print("Ingrese la cantidad de libros que hay por estante: ");
        n=sc.nextInt();
        System.out.print("Ingrese la cantidad de cambios disponibles: ");
        k=sc.nextInt();
        while(k>n || k<0){
            System.out.println("Cantidad de cambios inaceptable");
            System.out.println("Digite una cantidad de cambio entre el rango de 0 y "+n);
            System.out.print("Cantidad de cambios: ");
            k=sc.nextInt();
        }
        int [] estante1= new int [n];
        int [] estante2= new int [n];
        
        System.out.println("INGRESO DE VALORES DEL ESTANTE 1");
        for(int i=0;i<n;i++){
            System.out.print("Digita el tamaño del libro #"+i+": ");
            estante1[i]=sc.nextInt();
        }
        System.out.println("INGRESO DE VALORES DEL ESTANTE 2");
        for(int i=0;i<n;i++){
            System.out.print("Digita el tamaño del libro #"+i+": ");
            estante2[i]=sc.nextInt();
        }
        
        // BUCLE PARA REALIZAR CAMBIOS DE UBICACION
        for(int g = 0;g<k;g++){
            int numMaxEst1=estante1[0];
            int posMaxEst1=0;
            int numMaxEst2=estante2[0];
            int posMaxEst2=0;

            int numMinEst1=estante1[0];
            int posMinEst1=1;
            int numMinEst2=estante2[0];
            int posMinEst2=0;
            //VERIFICACION DE NUMEROS MAYOR Y MENOR JUNTO CON SUS POSICIONES
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
            //CAMBIO DE VALORES
            if(numMaxEst1<numMaxEst2){
                int numAux;
                numAux = estante1[posMaxEst1];
                estante1[posMaxEst1]=numMinEst2;
                estante2[posMinEst2]=numAux;  
            }
            if(numMaxEst1>numMaxEst2){
                int numAux;
                numAux = estante1[posMinEst1];
                estante1[posMinEst1]=numMaxEst2;
                estante2[posMaxEst2]=numAux;  
            }  
        }
        
        // IMPRESION FINAL DE ESTANTES (ARRAYS)
        System.out.println("********** Posible organizacion recomendada **********");
        System.out.println("\nESTANTE 1");
        for(int i=0;i<n;i++){
            System.out.print(estante1[i]+" ");
        }
        System.out.println("");
        System.out.println("\nESTANTE 2");
        for(int i=0;i<n;i++){
            System.out.print(estante2[i]+" ");
        }
        System.out.println("");
        //REDECLARACION DE VARIABLE PARA MAYOR Y MENOR EN CADA VECTOR
        int numMaxEst1=estante1[0];
        int numMaxEst2=estante2[0];
        for(int i=0;i<n;i++){
            if(numMaxEst1<estante1[i]){
                numMaxEst1=estante1[i];
            }
        }
        for(int j=0;j<n;j++){
            if(numMaxEst2<estante2[j]){
                numMaxEst2=estante2[j];
            }
        }
        //CALCULO DE INDICE
        indice=numMaxEst1+numMaxEst2;
        System.out.println("\nIndice: "+indice);
    }
}


