import java.util.*;
public class Circuferencias {
    int x;
    int y;
    int r;
    
    public Circuferencias(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    static boolean interseccion(Circuferencias c1,Circuferencias c2){
        int xMax=1, yMax=1,rMax=1;
        int xMin=1, yMin=1,rMin=1;
        int difX=1, difY=1,sumR=1;
        boolean respuesta = false;
        if(c1.x > c2.x){
            xMax=c1.x;
            xMin=c2.x;
        }
        if(c1.x < c2.x){
            xMax=c2.x;
            xMin=c1.x;
        }
        if(c1.y > c2.y){
            yMax=c1.y;
            yMin=c2.y;
        }
        if(c1.y < c2.y){
            yMax=c2.y;
            yMin=c1.y;
        }

        difX = xMax-xMin;
        difY = yMax-yMin;
        sumR = c1.r+c2.r;
        
        if(c1.x==c2.x && c1.y==c2.y){
            respuesta= false;
        }
        else{
            if(difX>=0 && difX<sumR){
                if(difY>=0 && difY<sumR){
                    respuesta = true;
                }
            }
            else{
                respuesta = false;
            }
        }
        
        return respuesta;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("DIGITE LA POSISION EN X DEL CIRCULO 1: ");
        int x1 = sc.nextInt();
        System.out.print("DIGITE LA POSISION EN Y DEL CIRCULO 1: ");
        int y1 = sc.nextInt();
        System.out.print("DIGITE EL RADIO DEL CIRCULO 1: ");
        int r1 = sc.nextInt();
        
        System.out.print("DIGITE LA POSISION EN X DEL CIRCULO 2: ");
        int x2 = sc.nextInt();
        System.out.print("DIGITE LA POSISION EN Y DEL CIRCULO 2: ");
        int y2 = sc.nextInt();
        System.out.print("DIGITE EL RADIO DEL CIRCULO 2: ");
        int r2 = sc.nextInt();
        
        Circuferencias c1 = new Circuferencias(x1,y1,r1);
        Circuferencias c2 = new Circuferencias(x2,y2,r2);
        
        System.out.println("Los circulos se cortan?: ");
        boolean r = interseccion(c1,c2);
        
        System.out.println(r);
    }
    
}
