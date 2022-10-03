
import java.util.Scanner;


public class MatrizCaracolNxM {
    public static void main(String[] args){
        
		Scanner sc=new Scanner(System.in);
                System.out.print("Digite la cantidad de filas: ");
		int n=sc.nextInt();
                System.out.print("Digite la cantidad de columnas: ");
		int m=sc.nextInt();
		
		int[][] matriz=new int[n][m];
		int izq=0;// Dirección izquierda
		int der=matriz[0].length-1;//Dirección correcta
		int arriba=0;//Hacia arriba
		int abajo=matriz.length-1;//Hacia abajo
		
		String direction="derecha";// La dirección a recorrer
		int temp=1;
		while(izq<=der&&arriba<=abajo){
			if(direction.equals("derecha")){
				for(int i=izq;i<=der;i++){
					matriz[arriba][i]=temp++;
				}
		
				arriba++;
				direction="abajo";
			}else if(direction.equals("abajo")){
				for(int i=arriba;i<=abajo;i++){
					matriz[i][der]=temp++;
				}
				
				der--;
				direction="izquierda";
			}else if(direction.equals("izquierda")){
				for(int i=der;i>=izq;i--){
					matriz[abajo][i]=temp++;
				}
				
				abajo--;
				direction="arriba";
			}else if(direction.equals("arriba")){
				for(int i=abajo;i>=arriba;i--){
					matriz[i][izq]=temp++;
				}
				
				izq++;
				direction="derecha";
			}
		}
        System.out.println("");
                for(int i=0; i<n;i++){
                    for(int j=0;j<m;j++){
                        System.out.print("\t"+matriz[i][j]);
                    }
                    System.out.println("");
                }
    }
}
