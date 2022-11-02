
package codigosaulas;
import java.util.*;
public class EntregaVacunas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vacunas=1000;
        String preg;
        
        while(vacunas>0){
            System.out.println("Vas a entregar vacuna?(SI/NO): ");
            preg=sc.nextLine();
//            preg.toUpperCase();
            if("si".equals(preg)){
                vacunas=vacunas-1;
            }
            if(vacunas<=200){
                System.out.println("QUEDAN "+vacunas+"!!!!!!!");
            }
        }
    }
    
}
