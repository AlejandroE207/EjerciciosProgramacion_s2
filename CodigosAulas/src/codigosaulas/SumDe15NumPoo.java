
package codigosaulas;
import java.util.*;
public class SumDe15NumPoo {
    int sum;

    public SumDe15NumPoo(int sum) {
        this.sum = sum;
    }
    
    public double Prom(){
        double prom=this.sum/15;
        return prom;
    }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        for(int i=1;i<=15;i++){
            System.out.print("Digite el valor del numero "+i+": ");
            sum+=sc.nextInt();
        }
        
        SumDe15NumPoo ob = new SumDe15NumPoo(sum);
        System.out.println("La sumatoria es: "+ob.sum);
        System.out.println("El promedio de la suma es: "+ob.Prom());
        
    }
}
