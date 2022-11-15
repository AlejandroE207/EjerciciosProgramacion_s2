package Punto1;
import java.util.*;
public class Punto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matriz=new int[5][5];
//        int matriz[][]={{1,1,1,5,5},
//                        {2,1,5,5,4},
//                        {2,1,5,4,4},
//                        {2,2,4,4,3},
//                        {2,3,3,3,3}};
  
        int filas=matriz.length;
        int colum=matriz[0].length;
        int n,numVal=0;
        int uniones;
        System.out.println("////////// PUNTO 1 //////////");
//BUCLE DE LLENADO DE MATRIZ
        System.out.println("LLENADO DE MATRIZ");
        for(int i=0;i<filas;i++){
            for(int j=0;j<colum;j++){
                System.out.print("Digite el valor de la posicion ["+i+"]["+j+"]:");
                n=sc.nextInt();
                
            }
        }
        ArrayList<Integer> valores = new ArrayList<>();
        for(int i=0;i<filas;i++){
            for(int j=0;j<colum;j++){
                if(valores.indexOf(matriz[i][j])<0){ //IF QUE VERIFICA SI EL NUMERO SE REPITE O NO, POR ESO <0 TIENE QUE SER MENOR OSEA QUE NO EXISTE EL NUMERO EN LA LIST
                    valores.add(matriz[i][j]);
                }
            }
        }

        numVal=valores.size();
        System.out.println(numVal);
        uniones=(filas*colum)-numVal;
        
//BUCLE DE COMPARACION PARA SABER SI ES O NO CONTIGUA
       for(int i=0;i<filas;i++){
           for(int j=0;j<colum;j++){
                if((j<colum-1)&&(i<filas-1)){
                    if((matriz[i][j]==matriz[i][j+1])||(matriz[i][j]==matriz[i+1][j])){
                        uniones--;
                    }
                    if((matriz[i][j]==matriz[i][j+1])&& (matriz[i][j]==matriz[i+1][j])){
                        uniones--;
                    }
                }
                if(j==colum-1){
                    if(i<filas-1){
                        if(matriz[i][j]==matriz[i+1][j]){
                            uniones--;
                        }
                    }
                }
                if(i==filas-1){
                    if(j<colum-1){
                        if(matriz[i][j]==matriz[i][j+1]){
                            uniones--;
                        }
                    }
                }
           }
       }
        System.out.println("Uniones "+uniones);
       if(uniones==0){
           System.out.println("Matriz contigua");
       }
       else{
           System.out.println("Matriz no contigua");
       }
    }
}

