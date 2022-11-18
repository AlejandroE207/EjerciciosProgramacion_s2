package Punto3;
import java.util.*;

public class Punto3 {

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int matriz[][]=new int[10][10];
        int opc=0;
        System.out.println("¿QUE VALORES DESEA? (DIGITE EL NUMERO 1 0 2):\n1. VALORES DEL EJERCICIO\n2. VALORES ALEATORIOS");
        System.out.print(": ");opc=sc.nextInt();
        while(opc>2 || opc<1){
            System.out.println("DIGITE EL NUMERO DE ALGUNO DE LAS OPCIONES:\n1. VALORES DEL EJERCICIO\n2. VALORES ALEATORIOS");
            System.out.print(": ");opc=sc.nextInt();
        }
        if(opc==1){
            int matriz2 [][] = {{23,46,62,31,22,5,88,97,12,27},
                            {11,30,15,9,14,3,27,33,37,23},
                            {24,13,32,27,35,69,47,62,87,44},
                            {99,84,25,77,44,51,27,49,62,88},
                            {36,11,19,73,57,37,88,55,44,24},
                            {37,48,94,75,42,41,33,25,27,13},
                            {59,44,27,64,17,85,61,87,84,6},
                            {61,73,68,69,69,92,38,22,39,48},
                            {18,11,49,37,57,59,91,97,95,63},
                            {20,30,44,63,77,88,54,19,26,77}};
            matriz=matriz2;
        }
        int filas=10;
        int columnas=10;
        
        if(opc==2){
            for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=rd.nextInt(99);
            }
            System.out.println("\t");
        }
        System.out.println("");
        }
        
        
        System.out.println("********** MATRIZ 10x10 **********");
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                System.out.print("["+matriz[i][j]+"] \t");
            }
            System.out.println("\t");
        }
        System.out.println("");
        
        
        int cont=1;
        int colmIn=0,filIn=0;
        int colmFin=2,filFin=2;
        for(int i=1;i<=10;i++){
            if(colmIn<9 && colmIn!=8){
                imprimirSubMatriz(matriz,filIn , colmIn, filFin, colmFin,cont);

            }
            
            if(colmIn>=9){
                colmIn=9;colmFin=1;filIn=0;filFin=5;
                imprimirSubMatriz(matriz,filIn , colmIn, filFin, colmFin,cont);
                colmIn=-1;colmFin=1;filIn=3;filFin=5;
            }
            
            if(colmIn>=8){
                colmIn=8;colmFin=0;filIn=3;filFin=8;
                imprimirSubMatriz(matriz,filIn , colmIn, filFin, colmFin,cont);
                colmIn=-2;;colmFin=0;filIn=6;filFin=8;
            }
            colmIn+=3;colmFin+=3; 
            cont++;
        }
    }
    
    
    public static void imprimirSubMatriz(int[][]matriz,int filIn,int colmIn,int filFin,int colmFin,int cont){
        
        if(colmIn==9 && colmFin==1){
            int [][]matAux=new int [3][3];
            //FOR MAT AUXILIAR 
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    matAux[j][i]=matriz[j][i+7];
                }
            }
            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
                    matAux[j][i]=matriz[j+3][i];
                }
            }
            for(int i=0;i<=0;i++){
                for(int j=0;j<3;j++){
                    int aux=matAux[j][i];
                    matAux[j][i]=matAux[j][i+2];
                    matAux[j][i+2]=aux;
                }
            }
            for(int i=1;i<=1;i++){
                for(int j=0;j<3;j++){
                    int aux=matAux[j][i];
                    matAux[j][i]=matAux[j][i+1];
                    matAux[j][i+1]=aux;
                }
            }
            
            System.out.println("****** SUBMATRIZ: "+cont+" ******");
            posicionMenor(matAux);
            
        }
        
        //SEGUNDA MATRIZ PARTIDA
        if(colmIn==8 && colmFin==0){

            int [][]matAux=new int [3][3];
            
             for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    matAux[j][i]=matriz[j+3][i+7];
                }
            }
            for(int i=0;i<=0;i++){
                for(int j=0;j<3;j++){
                    matAux[j][i]=matriz[j+6][i];
                }
            }
            for(int i=0;i<=0;i++){
                for(int j=0;j<3;j++){
                    int aux=matAux[j][i];
                    matAux[j][i]=matAux[j][i+2];
                    matAux[j][i+2]=aux;
                }
            }
            for(int i=0;i<=0;i++){
                for(int j=0;j<3;j++){
                    int aux=matAux[j][i];
                    matAux[j][i]=matAux[j][i+1];
                    matAux[j][i+1]=aux;
                }
            }
            
            //IMPRESION SEGUNDA MATRIZ PARTIDA
            System.out.println("****** SUBMATRIZ: "+cont+" ******");
            posicionMenor(matAux);
        }
        
        //MATRICES NORMALES
        if(colmIn<9 && colmFin>colmIn){
//            int numMin=9999;
//            int minAux=0;
//            int filMin=0,colMin=0;
            int[][]matAux= new int[3][3];
            for(int i=filIn;i<=filFin;i++){
                for(int j=colmIn;j<=colmFin;j++){
                    matAux[i-filIn][j-colmIn]=matriz[i][j]; 
                }
            }
            System.out.println("****** SUBMATRIZ: "+cont+" ******");
            posicionMenor(matAux);
        } 
    }
    
    public static void posicionMenor(int [][]mat){
        int min=mat[0][0];
        int auxMin=0;
        int coMin=0;int fiMin=0;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(min>mat[i][j]){
                    min=mat[i][j];
                    coMin=j;fiMin=i;
                }
            }
        }
        auxMin=mat[1][1];
        mat[1][1]=min;
        mat[fiMin][coMin]=auxMin;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+mat[i][j]+"] \t");
            }
            System.out.println("");
        }
        System.out.println("Numero menor: "+min);
        System.out.println("Fila Original: "+fiMin);
        System.out.println("Columna Original: "+coMin);
        System.out.println("");
        
        
    }
}
    
