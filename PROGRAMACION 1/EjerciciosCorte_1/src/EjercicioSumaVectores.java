import java.util.Scanner;
import java.util.Random;
public class EjercicioSumaVectores {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        int n,m;
        int mayor,menor;
        System.out.print("Digite el tamaño del vector a: ");
        n=sc.nextInt();
        System.out.print("Digite el tamaño del vector b: ");
        m=sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];
         
        if(n>m || n==m){
            mayor=n;
            menor=m; 
        }
        else{
            mayor=m;
            menor=n;
        }
        int c[] = new int[mayor];
        
        System.out.println("vector a\n");
        for(int i=0;i<n;i++){
            a[i]=rn.nextInt(100);
            System.out.print(a[i]+", ");
        }
        
        System.out.println("\nvector b\n");
        for(int i=0;i<m;i++){
            b[i]=rn.nextInt(100);
            System.out.print(b[i]+", ");
        }
        
        System.out.println("\nVECTOR  C\n");
        for(int i=0; i<menor;i++){
            c[i]=a[i]+b[i];
            System.out.print(c[i]+", ");
        }
        for(int i=menor;i<mayor;i++){
            if(n>m){
                c[i]=a[i];
            }
            else{
                c[i]=b[i];
            }
            
        }
        
       System.out.print("\nVECTOR C COMPLETO\n");
        for(int i=0;i<mayor;i++)
            System.out.print(c[i]+", ");
        
    }
}
