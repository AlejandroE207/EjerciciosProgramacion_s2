import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n; int i, j;
        int suma;
        
        System.out.print(("Digite hasta que numero se verificara: "));
        n=sc.nextInt();
        
        for(i=1;i<=n;i++){
            suma=0;
            for(j=2;j<i;j++){
                if(i%j==0){
                    suma=suma+j;
                }
            }
            if(i==suma){
                System.out.println(i);
            }
        }
    }
}
