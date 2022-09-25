import java.util.Scanner;
public class EjercicioPromCurso {
    public static void main(String[] args){
        int n,contPerd=0,contPas=0;
        double nota,t,prom,sumNot=0, sumPerd=0,sumPas=0,promPas=0, promPerd=0;
        int encima=0,debajo=0;
        int porcPerd=0, porcPas=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite el numero de estudiantes (Tamaño del vector): ");
        n=sc.nextInt();
        
        double[] grup=new double [n];
        
        for(int i=0;i<n;i++){
            System.out.println("Digite la nota del estudiante numero "+i+": ");
            nota=sc.nextDouble();
            grup[i]=nota;
            
            sumNot+=nota;
            
            if(nota>=3.0){
                contPas++;
                sumPas+=nota;
            }
            if(nota<3.0){
                contPerd++;
                sumPerd+=nota;
            }  
        }
        
        //CALCULOS
        prom=sumNot/n;
        promPerd=sumPerd/contPerd;
        promPas=sumPas/contPas;
        porcPerd=(contPerd*100)/n;
        porcPas=(contPas*100)/n;
        
        for(int i=0;i<n;i++){
            t=grup[i];
            if(t>prom){
                encima++;
            }
            if(t<prom){
                debajo++;
            }
        }
        
        
        System.out.println("El promedio del grupo es: "+prom);
        System.out.println("La cantidad de estudiantes que perdieron es de:  "+contPerd);
        System.out.println("La cantidad de estudiantes que pasaron es de:  "+contPas);
        System.out.println("El promedio de los que perdieron es: "+promPerd);
        System.out.println("El promedio de los que pasaron es: "+promPas);
        System.out.println("El porcentaje de los estudiantes que perdieron: "+porcPerd+"%" );
        System.out.println("el porcentaje de los estudiantes que pasaron: "+porcPas+"%" );
        System.out.println("La cantidad de estudiantes que estan por encima del promedio es: "+encima);
        System.out.println("La cantidad de estudiantes que estan por debajo del promedio es: "+debajo);
        
    }
    
    
    public static double Convertir(double numero){
        String Snum = String.valueOf(numero);
        String num="";
        for(int i=0;i<3;i++){
            num+=Snum.charAt(i);
        }
        double dNum = Double.parseDouble(num);
        return dNum;
    }
}
