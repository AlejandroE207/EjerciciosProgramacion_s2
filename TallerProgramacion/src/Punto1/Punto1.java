package Punto1;
import java.util.*;
public class Punto1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]matriz=new int[5][5];
  
        int filas=matriz.length;
        int colum=matriz[0].length;
        int n,numVal=0;
        int uniones;
        int opc=0;
        //MENU SI DESEA UTILIZAR LOS DATOS DEL EJERCICIO O SEAN RANDOM
        System.out.println("////////// PUNTO 1 //////////\n");
        System.out.println("¿QUE VALORES DESEA? (DIGITE EL NUMERO 1 0 2):\n1. VALORES DEL EJERCICIO\n2. DIGITAR VALORES");
        System.out.print(": ");opc=sc.nextInt();
        while(opc>2 || opc<1){//EL VALOR DE LA OPCIO TIENE QUE SER 1 O 2
            System.out.println("DIGITE EL NUMERO DE ALGUNO DE LAS OPCIONES:\n1. VALORES DEL EJERCICIO\n2. DIGITAR VALORES");
            System.out.print(": ");opc=sc.nextInt();
        }
        if(opc==1){
            int matriz2[][]={{1,5,1,5,5},
                            {2,1,5,5,4},
                            {2,1,5,4,4},
                            {2,2,4,4,3},
                            {2,3,3,3,3}};
            matriz=matriz2;
        }
        if(opc==2){
            System.out.println("LLENADO DE MATRIZ");
            for(int i=0;i<filas;i++){
                for(int j=0;j<colum;j++){
                    System.out.print("Digite el valor de la posicion ["+i+"]["+j+"]:");
                    n=sc.nextInt();
                }
            }
        }
        
        ArrayList<Integer> valores = new ArrayList<>();
        for(int i=0;i<filas;i++){
            for(int j=0;j<colum;j++){
                if(valores.indexOf(matriz[i][j])<0){ //IF QUE VERIFICA SI EL NUMERO SE REPITE O NO, POR ESO <0 TIENE QUE SER MENOR OSEA QUE NO EXISTE EL NUMERO EN LA LIST
                    valores.add(matriz[i][j]);
                }
            }
        }

        numVal=valores.size();
        uniones=(filas*colum)-numVal;
        
//BUCLE DE COMPARACION PARA SABER SI ES O NO CONTIGUA
       for(int i=0;i<filas;i++){
           for(int j=0;j<colum;j++){
                if((j<colum-1)&&(i<filas-1)){
                    if((matriz[i][j]==matriz[i][j+1])||(matriz[i][j]==matriz[i+1][j])){
                        uniones--;
                    }
                    if((matriz[i][j]==matriz[i][j+1])&& (matriz[i][j]==matriz[i+1][j])){
                        uniones--;
                    }
                }
                if(j==colum-1){
                    if(i<filas-1){
                        if(matriz[i][j]==matriz[i+1][j]){
                            uniones--;
                        }
                    }
                }
                if(i==filas-1){
                    if(j<colum-1){
                        if(matriz[i][j]==matriz[i][j+1]){
                            uniones--;
                        }
                    }
                }
           }
       }
        for(int i=0;i<filas;i++){
            for(int j=0;j<colum;j++){
                System.out.print("{"+matriz[i][j]+"] \t");
            }
            System.out.println("");
        }
       if(uniones==0){
           System.out.println("Matriz contigua");
       }
       else{
           System.out.println("Matriz no contigua");
       }
    }
}

