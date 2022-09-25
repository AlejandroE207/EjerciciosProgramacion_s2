import java.util.Random;
import java.util.Scanner;
public class EjercicioMatrices {
    
    public static void main(String [] args){
        int m, n;
        int sumFil=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Digite la cantidad de filas: ");
        n=sc.nextInt();
        System.out.println("Digite la cantidad de columnas: ");
        m=sc.nextInt();
        int matriz [][] = new int [n][m];
        int matriz2 [][]= new int [n][m];
        int matrizDiag [][]= new int [n][m];
        System.out.println("MATRIZ CON VALORES ALEATORIOS");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matriz[i][j]=rd.nextInt(100);
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j]+" ");;
                
            }
            System.out.println("");
        }
        
        System.out.println("\nMATRIZ LLENADA POR COLUMNA");
        for(int i = 0; i<m;i++){
            for(int j=0;j<n;j++){
                matriz2[j][i]=sc.nextInt();
            }
        }
        for(int i = 0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz2[j][i]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("\nDIAGONAL PRINCIPAL");
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(i == j){
                    matrizDiag[i][j]=1;
                }
                if(j<i){
                    matrizDiag[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrizDiag[i][j]+" ");;
                
            }
            System.out.println("");
        }
        
        System.out.println("\nSUMATORIA POR FILA");
        for(int i=0; i<n;i++){
            for(int j=0;j<m;j++){
                sumFil+=matriz[i][j];
            }
            System.out.println("Sumatoria de la fila "+i+" es: "+sumFil);
        }
    }
}
