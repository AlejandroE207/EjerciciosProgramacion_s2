import java.util.Scanner;
import java.time.LocalDate;
public class EjercicioFecha {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int d,m,a;
        LocalDate fechaDig, fechaSig;
        
        System.out.print("Digite el dia: ");
        d=sc.nextInt();
        System.out.print("Digite el mes: ");
        m=sc.nextInt();
        System.out.print("Digite el año: ");
        a=sc.nextInt();
        
        fechaDig = LocalDate.of(a, m, d);
        System.out.println("La fecha que se digito es: "+fechaDig);
        
        fechaSig=fechaDig.plusDays(1);
        
        System.out.println("La fecha siguiente es: "+fechaSig);
        
        

        
    }
}
