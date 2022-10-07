import java.util.*;
public class Vector2 {
    int vec[][];
    int n;
    int m;
    
    public Vector2(int n,int m){
        vec = new int [n][m];
        this.n=n;
        Random rd = new Random();
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                vec[i][m]=rd.nextInt(100);
        }
    }
    
    public void ordenar(){
        int aux = 0;        
        for(int i=0;i<n;i++){
            for( int j=0;j<n-1;j++){
                for(int h=0;h<m;h++)
                    if(vec[j][h]>vec[j][h+1]){
                        aux=vec[j][h];
                        vec[j]=vec[j+1];
                        vec[j+1][h]=aux;
                }
            }
        }
    }
    
    
    public String mostrarVector(){
        String cad = " ";
        for (int i=0;i<n;i++){
            cad+="[ "+vec[i]+"]";
        }
        return cad;
        
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite tamaño del vector: ");
        int n = sc.nextInt();
        Vector1 v1 = new Vector1(n);
        System.out.println(" Vector no organizado");
        System.out.println(v1.mostrarVector()+"\n");
        v1.ordenar();
        System.out.println("Vector no ordenado");
        System.out.println(v1.mostrarVector());
    }
}

}
