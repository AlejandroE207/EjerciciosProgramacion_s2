
public class BurbujaMatriz {

    public static void main(String[] args) {

        int matriz[][] = {{10,5,9},{3,6,1},{8,7,2}};
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int aux;
        System.out.println("La matriz original es:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        for(int a=0; a<matriz.length;a++){
            for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < columnas; k++) {
                    if (matriz[i][j] < matriz[i][k]) {
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[i][k];
                        matriz[i][k]=aux;
                    }
                }
            }
        }
        }
        
        for(int a=0; a<matriz.length;a++){
            for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                for (int k = 0; k < columnas; k++) {
                    if (matriz[j][i] < matriz[k][i]) {
                        aux = matriz[i][j];
                        matriz[j][i] = matriz[k][i];
                        matriz[k][i]=aux;
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
