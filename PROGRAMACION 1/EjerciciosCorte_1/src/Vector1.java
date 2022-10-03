import java.util.*;
public class Vector1 {
    int vec[];
    int n;
    
    public Vector1(int n){
        vec = new int [n];
        this.n=n;
        Random rd = new Random();
        for(int i=0; i<n;i++){
            vec[i]=rd.nextInt(100);
        }
    }
    
    public void ordenar(){
        int aux = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(vec[j]>vec[j+1]){
                    aux=vec[j];
                    vec[j]=vec[j+1];
                    vec[j+1]=aux;
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
