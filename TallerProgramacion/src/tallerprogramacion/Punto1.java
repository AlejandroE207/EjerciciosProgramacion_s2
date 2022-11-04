
package tallerprogramacion;
import java.util.*;
public class Punto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matriz=new int[5][5];
        int filas=matriz.length;
        int colum=matriz[0].length;
        int n;
        int num1=0,num2=0,num3=0,num4=0,num5=0;
        
        System.out.println("Digite valores del 1 al 5!!");
        for(int i=0;i<filas;i++){
            for(int j=0;j<colum;j++){
                System.out.print("Digite el valor de la posicion ["+i+"]["+j+"]:");
                n=sc.nextInt();
                if(n>=1 && n<=5){
                    matriz[i][j]=n;
                }
                else{
                    System.out.println("Digite por favor numeros del 1 al 5");
                    System.out.print("Digite el valor de la posicion ["+i+"]["+j+"]:");
                    n=sc.nextInt();
                    matriz[i][j]=n;
                }
                if(n==1){
                    num1++;
                }
                if(n==2){
                    num2++;
                }
                if(n==3){
                    num3++;
                }
                if(n==4){
                    num4++;
                }
                if(n==5){
                    num5++;
                }
                
            }
        }
        for(int i=0;i<filas;i++){
            for(int j=0;j<colum;j++){
                if(matriz[i][j]==matriz[i][j+1]){
                    
                }
            }
        }
        
    }
    
}
