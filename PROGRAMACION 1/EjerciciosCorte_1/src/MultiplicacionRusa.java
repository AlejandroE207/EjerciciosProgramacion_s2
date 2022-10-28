import java.util.*;
public class MultiplicacionRusa {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, m;
        int sum=0;
        System.out.print("Digite el valor del multiplicando: ");
        n=sc.nextInt();
        System.out.print("Digite el valor del multiplicador: ");
        m=sc.nextInt();
        
        System.out.println("Se ha ingresado la operación: "+n+" x "+m);
        
        //Multiplicacion metodo
        do{
            if(n%2==1){
                sum+=m;
            }
            n=n/2;
            m=m*2;
        }
        while(n>=1);
        
        System.out.println("Resultado multiplicacion rusa: "+sum);
    }
    
}
