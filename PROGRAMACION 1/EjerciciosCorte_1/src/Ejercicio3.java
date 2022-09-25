/*
IMPRIMIR LA CANTIDAD DE MULTIPLOS DE 2 Y 3 QUE HAY DEL 1 AL 100
*/
public class Ejercicio3 {

    public static void main(String[] args) {
        int mult2=0;int mult3=0;
        
        for(int i=1;i<=100;i++){
            if(i%2==0){
                mult2++;
            }
            
            if(i%3==0){
                mult3++;
            }
        }
        System.out.println("Cantidad de multiplos de 2: "+mult2);
        System.out.println("Cantidad de multiplos de 3: "+mult3);
    }
    
}