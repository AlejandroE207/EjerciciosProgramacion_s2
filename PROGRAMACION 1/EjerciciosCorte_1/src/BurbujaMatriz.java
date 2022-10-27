
public class BurbujaMatriz {

    public static void main(String[] args) {

        int matriz[][] = {{10,5,9},{3,6,1},{8,7,2}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        
        System.out.println("La matriz original es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0; i<=filas;i++){
            for(int j=0; j<=columnas;j++){
                for(int k=0;k<=filas;k++){
                    for(int g=0;g<=columnas;g++){
                        if(matriz[i][j]>=matriz[k][g]){
                            matriz[i][j]=matriz[i][j];
                        }
                        else{
                            int aux=matriz[k][g];
                            matriz[k][g]=matriz[i][j];
                            matriz[i][j]=aux;
                        }
                    }
                }
            }
        }
        
        System.out.println("\nORDENADA");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
