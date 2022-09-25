/*
IMPRIMIR LOS NUMEROS DEL 1 AL 100
SUMANDO LOS NUMEROS PARES Y LOS IMPARES
*/
public class Ejercicio1 {

    public static void main(String[] args) {
        int sumPar = 0, sumImp = 0;
        int i;
        
        for (i = 1; i<=100;i++){
            System.out.println(i);
            if(i%2==0){
                sumPar = sumPar + i;
            }
            else{
                sumImp = sumImp + i;
            }
        }
        System.out.println("La suma de los numeros pares es: "+sumPar);
        System.out.println("La suma de los numeros impares es: "+sumImp);
    }
}
