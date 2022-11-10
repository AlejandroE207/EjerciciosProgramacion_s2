import java.util.*;
public class MultRusaPoo {
    int n;
    int m;
    
    public MultRusaPoo(int n,int m){
        this.n=n;
        this.m=m;
    }
    
    public int multiplicacion(){
        int sum=0;
        if(this.n<0 || this.m<0){
            if(this.n<0){
                n=n*(-1);
            }
            if(this.m<0){
                m=m*(-1);
            }
            do{
                if(n%2==1){
                    sum+=m;
                }
                    n=n/2;
                    m=m*2;
                }   
            while(n>=1);
            sum=sum*(-1);
        }
        else{
            do{
                if(n%2==1){
                    sum+=m;
                }
                    n=n/2;
                    m=m*2;
                }   
            while(n>=1);
        }
        
        return sum;
    }
    
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n,m;
        try{
            System.out.print("Digite el valor del multiplicando: ");
            n=sc.nextInt();
            System.out.print("Digite el valor del multiplicador: ");
            m=sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Digite numeros enteros POR FAVOR >:C");
        }
        finally{
            System.out.print("Digite el valor del multiplicando: ");
            n=sc.nextInt();
            System.out.print("Digite el valor del multiplicador: ");
            m=sc.nextInt();
        }
        
        MultRusaPoo mult = new MultRusaPoo(n,m);
        
        System.out.println("El resultado de la operacion "+n+" x "+m+" es: "+mult.multiplicacion());
    }
}

