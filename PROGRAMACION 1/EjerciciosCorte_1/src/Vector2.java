import java.util.Random;
import java.util.Scanner;
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
                vec[i][j]=rd.nextInt(100);
            }
        }
    }
    
   
    public void ordenar(){   
        
        for (int i=0;i<n;i++){
            for (int j =0;j<m;j++){
                for (int x =0;x<n;x++){
                    for (int y=0;y<m;y++){
                        if (vec[x][y]>vec[i][j]){
                            int aux = vec[i][j];
                            vec[i][j]=vec[x][y];
                            vec[x][y]=aux;
                        }
                        
                    }
                            
                }
            }
        }
    }
    
//    public void ordenar(){
//        int x,y;
//        for(int i=0;i<vec.length;i++){
//            for(int j=0;j<vec[i].length;j++){
//                
//            }
//        }
//    }
    
    
    public String mostrarVec(){
        String mat = "  ";
        for (int i=0,j;i<vec.length;i++){
            for(j=0;j<vec[i].length;j++){
                mat+="[ "+vec[i][j]+"]";
            }
            System.out.println(" ");
        }
        String cat = mat;
        return cat;
        
    }
    
//    public String mostrar_matriz(){
//        String cad = " ";
//        for (int i = 0,j;i<n;i++){ 
//            for(j=0;j<m;j++){
//                cad+="["+vec[i][j]+"]"+"\t";   
//            }
//            cad+="\n";
//        }  
//        return cad;
//    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite numero de filas: ");
        int n = sc.nextInt();
        System.out.print("Digite numero de columnas: ");
        int m = sc.nextInt();
        Vector2 v2 = new Vector2(n,m);
        System.out.println(" Vector no organizado");
        System.out.print(v2.mostrarVec()+"\n");
        v2.ordenar();
        System.out.println("Vector no ordenado");
        System.out.println(v2.mostrarVec());
    }
}

