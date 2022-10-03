import java.util.Scanner;
public class EjercicioMatrizFormaCaracol {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("La matriz sera de NxN (cuadrada) Digite el tamaño: ");
        int n;
        n = sc.nextInt();
        int a=0, b=n-1, valor=1;
        int[][] matriz = new int [n][n];
       
        for(int j=0;j<matriz.length;j++){
            for(int i=a; i<=b;i++){
                matriz[a][i] = valor++;
            }
            for(int i=a+1; i<=b;i++){
                matriz[i][b] = valor++;
            }
            for(int i=b-1; i>=a;i--){
                matriz[b][i] = valor++;
            }
            for(int i=b-1; i>=a+1;i--){
                matriz[i][a] = valor++;
            }
            a++;b--;
        }
        
        for(int i = 0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
       
    }
    
}
