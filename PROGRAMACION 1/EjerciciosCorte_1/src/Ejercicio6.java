import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = 0; int menor = 0;
        int num;
        for(int i = 1;i<=5;i++){
            System.out.print("Digite el valor del numero "+i+": ");
            num = sc.nextInt();
            
            if(i==1){
                mayor = num;
                menor = num;
            }
            else{
                if(num>mayor){
                    mayor = num;
                }
                if(num<menor){
                    menor = num;
                }
            }
        }
        System.out.println("El numero mayor es: "+mayor);
        System.out.println("El numero menor es: "+menor);
    }
    
}
