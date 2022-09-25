/*
Dado 10 numeros enteros que se ingresan por teclado calcular cuantos de ellos
son pares, su suma y promedio de los impares
*/
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int contPar=0,sumPar=0,contImp=0,sumImp=0,promImp=0;
        for(int i=0; i<=10;i++){
            System.out.println("Digite el valor del numero "+i+": ");
            num = sc.nextInt();
            
            if(num%2==0){
                contPar++;
                sumPar = sumPar + num;
            }
            else{
                contImp++;
                sumImp=sumImp + num;
            }
        }
        promImp = sumImp/contImp;
        
        System.out.println("Cantidad de numeros pares: "+contPar);
        System.out.println("Suma de los numeros pares: "+sumPar);
        System.out.println("Promedio de los numeros impares: "+promImp);
    }
    
}
