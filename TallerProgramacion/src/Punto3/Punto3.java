package Punto3;
import java.util.*;

public class Punto3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz [][] = {{23,46,62,31,22,5,88,97,12,27},
                            {11,30,15,9,14,3,27,33,37,23},
                            {24,13,32,27,35,69,47,62,87,44},
                            {99,84,25,77,44,51,27,49,62,88},
                            {36,11,19,73,57,37,88,55,44,24},
                            {37,48,94,75,42,41,33,25,27,13},
                            {59,44,27,64,17,85,61,87,84,6},
                            {61,73,68,69,69,92,38,22,39,48},
                            {18,11,49,37,57,59,91,97,95,63},
                            {20,30,44,63,77,88,54,19,26,77}};
        
        int filas=matriz.length;
        int columnas=matriz[0].length;
        int cont=0;
        int colmIn=0,filIn=0;
        int colmFin=2,filFin=2;
        for(int i=1;i<=3;i++){
            
//            for(int j=0;j<filas;j++){
//                for(int g=0;g<columnas;g++){
//                    if(g==9 && j==0){
//                        colmIn=9;colmFin=1;
//                        filIn=0;filFin=5;
//                    }
//                }
//            }
            imprimirSubMatriz(matriz,filIn , colmIn, filFin, colmFin);
            colmIn+=3;colmFin+=3;
            
        }
        imprimirSubMatriz(matriz,0 , 9, 5, 1);
    
    }
    
    public static void imprimirSubMatriz(int[][]matriz,int filIn,int colmIn,int filFin,int colmFin){
        if(colmIn>colmFin){
            System.out.println("IF PARTIDO");
            int [][]matAux=new int [3][3];
            int n=5;

            for(int i=colmIn;i<=9;i++){
                for(int j=filIn;j<=2;j++){
                    System.out.println(matriz[j][i]+" ");
                    matAux[j][i]=matriz[j][i];
                }
                System.out.print("");
            }
            for(int i=0;i<=1;i++){
                for(int j=3;j<=5;j++){
                    matAux[j][i]=matriz[j][i];
                }
            }
            
             for(int i=0;i<=1;i++){
                for(int j=3;j<=5;j++){
                    System.out.println(matAux[j][i]);
                }
            }
        }
        
        //IMPRESION DE MATRICES SIN CORTE
        for(int i=filIn;i<=filFin;i++){
            for(int j=colmIn;j<=colmFin;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\t");
        }
        System.out.println("");
    }
}
    
